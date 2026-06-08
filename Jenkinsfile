pipeline {
    agent any

    tools {
        maven 'Maven-3'
        jdk 'JDK17'
    }

    options {
        timestamps()
        buildDiscarder(logRotator(numToKeepStr: '10'))
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Run Cucumber Tests') {
            steps {
                sh 'mvn -B clean test'
            }
        }
    }

    post {
        always {
            junit allowEmptyResults: true, testResults: 'target/surefire-reports/*.xml'

            script {
                // Changed type from 'allure3' to 'allure' to match your global tools location
                withTool(name: 'Allure 3', type: 'allure') {
                    allure allureVersion: '3',
                           includeProperties: false,
                           results: [[path: 'target/allure-results']]
                }
            }

            archiveArtifacts artifacts: 'target/cucumber-report.json', allowEmptyArchive: true
        }
    }
}