pipeline {
  agent any
  
  environment { 
    NAME = 'reham farouk'
   }
  
  parameters {
    choice(name: 'environment', choices: ['dev', 'uat', 'prod'], description: 'Select environment to deploy')
}
  
  stages {
    stage ('Print') {
       steps {
            echo "Hello Devops Engineers"
        }
    }
  }
  
  post {
    always { 
        echo 'I will always say Hello again!'
    }
    success {
        echo 'I will say Hello only if job is success'
    }
    failure {
        echo 'I will say Hello only if job is failure'
    }
} 
  
  triggers {
    cron('H/15 * * * *')
}

}
