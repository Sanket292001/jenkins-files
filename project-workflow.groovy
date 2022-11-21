pipeline {
    agent any

    stages {
        stage("Build") {
            steps {
                echo "Building..."
                sleep 10
                echo "Build Created"
            }
        }
        stage("Deploy") {
            steps {
                echo "Deploying..."
                sleep 100
                echo "Successfully Deployed"
            }
        }
    }
}