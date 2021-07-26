def build_fct (params.choix) {
   if ( params.choix == 'build') 
    return true
    
} 

def test_fct () {
    return ( params.choix == 'test') 
    
} 

def deploy_fct () {
    return ( params.choix == 'deploy') 
    
} 

