//import hudson.plugin.git.GitSCM
import jenkins.model.*
jenkins = Jenkins.instance
import hudson.plugin.git.extension.impl.*

/*sh label: '', script: '''rm -rf ./* && git clone https://github.com/amanchourasia/JenkinsWar.git
                git clone http://rig:${rig_password}@${BB_URL}/scm/DEM/app.git
                cp -r ./JenkinsWar/* ./app
                cd app
                git init
                git add --all
                git commit -m"initial commit"
                git push -u origin master'''
   */             
              
              
 /*@NonCPS
 codePush(String data){
    def jsonSlurper = new JsonSlurper() 
    def resultJson = jsonSlurper.parseText(data)
 }*/
              
              
 def call(){
  def request = libraryResource 'data.json'
  //def del = "rm -rf JenkinsWar" 
 def link1 = "rm -rf ./* && git clone https://github.com/amanchourasia/JenkinsWar.git"
 def link2 = "git clone http://rig:${rig_password}@${BB_URL}/scm/DEM/app.git"
   echo "************** Aman Repo ************"
   //sh(del)
   sh(link1)
   sh(link2)
    }               
   /*def b = new StringBuffer()
   proc.consumeProcessErrorStream(b)

   println proc.text
   println b.toString()*/
 //codePush(request)
 

/*def call(){
def sout = new StringBuffer(), serr = new StringBuffer()

def proc ='../resources/codePush.sh'.execute()

//proc.consumeProcessOutput(sout, serr)
//proc.waitForOrKill(1000)
println sout
}*/


/*def call(Map stageParams) {
 
    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        userRemoteConfigs: [[ url: 'https://github.com/amanchourasia/JenkinsWar.git' ]]
    ])
  }*/
