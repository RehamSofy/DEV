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
     stage("build & SonarQube analysis") {
            steps {
              withSonarQubeEnv('SonarQube') {
                bat 'mvn -f Demo clean package'
              }
            }
          }
          stage("Quality Gate") {
            steps {
                echo 'Quality Gate'
              }
            }
            }
    stage('Test') {
      steps {
           junit 'Demo/target/surefire-reports/*.xml'
        }
    }
    
    stage('Code Coverage'){
      steps{
         step ([ $class: 'JacocoPublisher' ])
      }
    }
    
     stage('Deploy') {
            steps {
                echo 'Deploying....'
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
     pollSCM('*/1 * * * *')
}

}
