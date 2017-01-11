mavenJob("ImageGenerator") {
  logRotator(60, 20, 1, -1)
  description('I will generate artifact of application')
  scm {
   		git {
     		branch('*/dockerization')
     		remote {
       			name('')
       			refspec('')
       			url('https://github.com/OpsTree/ContinuousIntegration.git')
     		}
   		}
 	}
  goals('clean package')
  rootPOM('Spring3HibernateApp/pom.xml')
  mavenInstallation('maven2')
  postBuildSteps {
    shell("echo 'I'll create image'")
  }
}