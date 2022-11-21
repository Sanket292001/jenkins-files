pipeline {
    agent any

    stages {
        stage("Stage-1") {
            steps {
                echo "Hello World!"
                sleep 10
                echo "DONE"
            }
        }
    }
}