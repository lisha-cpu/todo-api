pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Test') {
            steps {
                // Runs JUnit tests on Windows using the batch wrapper
                bat 'mvnw.cmd test'
            }
        }
        
        stage('Build') {
            steps {
                // Builds the executable JAR file
                bat 'mvnw.cmd clean package -DskipTests'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'target/*.jar', allowEmptyArchive: true
        }
    }
}