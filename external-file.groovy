def build_fct () {
   if ( params.choix == 'build') 
    return true
    
} 

def test_fct () {
    return ( params.choix == 'test') 
    
} 

def deploy_fct () {
    return ( params.choix == 'deploy') 
    
} 

