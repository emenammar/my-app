def buildApp() {
    echo 'building the application...'
} 

def testApp() {
    echo 'testing the application...'
} 

def deployApp() {
    echo 'deplying the application...'
} 


def build_orn(){
    if(params.choix == '1'){
        return true
    }
}

return this

