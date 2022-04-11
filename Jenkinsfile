node{
    stage('Git Checkout'){
        git branch: 'main', credentialsId: 'git-private-key', poll: false, url: 'git@github.com:andreimoldovan23/BeerInventoryFailoverService.git'
    }

    stage('Build Project'){
        sh 'mvn clean package'
    }

    stage('Build Docker Image'){
        sh 'sudo docker build -t moldoandrei/beer-failover-service .'
    }

    stage('Push Docker Image'){
        withCredentials([string(credentialsId: 'docker-pwd', variable: 'dockerHubPwd')]) {
            sh "sudo docker login -u moldoandrei -p ${dockerHubPwd}"
        }
        sh 'sudo docker push moldoandrei/beer-failover-service'
    }
}