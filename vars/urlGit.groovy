import jenkins.Steps

class RandomClass{

  // get an instance of Steps proxy
  Steps  getSteps(){
    return new Steps()
  }

 // anywhere in the class code
 def someMethod(){
    steps.echo "Hello!"
    steps.sh "some shell command"
    //etc
 }
}

