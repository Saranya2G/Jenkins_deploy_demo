pipeline{
    agent any
    tools {
        maven "Maven"
    }
       stages{
           stage("Build Maven"){
               steps{
                   checkout scmGit(branches: [[name: '*/jenkins_Jacoco_report']], extensions: [], userRemoteConfigs: [[credentialsId: 'Saranya2G', url: 'https://github.com/Saranya2G/Jenkins_deploy_demo.git']])
                   bat "mvn clean install"
               }
           }
           stage("Build Docker Image"){
               steps{
                   script{
                       bat "docker build -t saran0809/sample-devops ."
                   }
               }
           }
           stage("Push Docker Image to hub"){
               steps{
                   script{
                       withCredentials([string(credentialsId: 'docker-pwd', variable: 'dockerpwd')]) {
                          bat "docker login -u saran0809 -p ${dockerpwd}" 
  
                        }
                        bat "docker push saran0809/sample-devops"
                   }
               }
           }
            stage("Run Docker Image"){
               steps{
                   script{
                       bat "docker compose -up -d"
                       bat "docker compose ps"
                   }
               }
           }
           
       }
}
