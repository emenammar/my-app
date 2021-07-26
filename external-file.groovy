def build_fct () {
    return ( params.choix == 'build') 
    
} 

def test_fct () {
    return ( params.choix == 'test') 
    
} 

def deploy_fct () {
    return ( params.choix == 'deploy') 
    
} 

