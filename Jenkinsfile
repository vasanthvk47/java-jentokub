pipeline {
    agent any

    environment {
        KUBECONFIG = "/var/jenkins_home/.kube/config"
        DOCKER_IMAGE = "vasanth4747/my-java-app:latest"
    }

    stages {
        stage("Build Docker Image") {
            steps {
                sh "docker build -t \$DOCKER_IMAGE ."
            }
        }

        stage("Push Docker Image") {
            steps {
                sh "docker push \$DOCKER_IMAGE"
            }
        }

        stage("Deploy to Kubernetes") {
            steps {
                sh """
                kubectl apply -f k8s/deployment.yaml
                kubectl apply -f k8s/service.yaml
                """
            }
        }
    }
}
