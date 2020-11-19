node { 
   stage ('GIT checkout'){
      git 'https://github.com/professorisidro/testador.git'
   }
   stage ('Compilar'){
      sh 'mvn package'
   }
   
}