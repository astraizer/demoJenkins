pipeline {
	agent any;
 	tools {
 		maven 'maven 3.8.7'
    }
	stages{
		stage("build"){
			steps {
				script{
			            sh 'mvn clean package -DskipTests=true'
				}
			}
		}
		stage("deploy"){
			steps{
				script{
					/*sshagent(credentials:['opc']){
						sh """
						ssh opc@168.138.214.199 rm -rf code
						ssh opc@168.138.214.199 mkdir -p code
						scp -r target/demoJenkins-0.0.1-SNAPSHOT.jar opc@168.138.214.199:code
						ssh opc@168.138.214.199 java -jar -server code/demoJenkins-0.0.1-SNAPSHOT.jar &
						"""
					}*/
					sh """
						ssh -i server.key opc@168.138.214.199 rm -rf code
						ssh -i server.key opc@168.138.214.199 mkdir -p code
						scp -r target/demoJenkins-0.0.1-SNAPSHOT.jar opc@168.138.214.199:code
						ssh -i server.key opc@168.138.214.199 java -jar -server code/demoJenkins-0.0.1-SNAPSHOT.jar &
						"""
				}
			}
		}

	}

}
