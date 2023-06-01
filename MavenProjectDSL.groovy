pipeline {
    agent any
	tools {
		
	}

    stages {
        stage('git checkout') {
            steps {
                https://github.com/opstree/spring3hibernate.git
            }
        }
    }
}











// job('first maven') {
//   description(" First maven job bu DSL on ${new Date()} , this is a small maven project on git ")
//     Scm {
//     		git("git@github.com:opstree/spring3hibernate.git", master)
//      }
//      triggers {
//      	scm('* * * * *')
//         }
//         steps {
//         	maven(' clean package ' , 'pom.xml')
// 	}
//     publishers {
//     	archiveArtifacts '**/*.jar'
//         }
//        }
