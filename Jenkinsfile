pipeline {
  agent any
     tools { 
        maven 'apache-maven-3.8.4' 
        jdk 'JDK 11' 
    }
  
  environment { 
    NAME = 'reham farouk'
   }
  
  stages {
    stage ('Build'){
       steps {
            bat 'mvn -f Demo clean package'
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
