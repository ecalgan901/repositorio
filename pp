creamos carpeta a mano en el escritorio.
inicializamos git init <nombre>
creamos archivo de texto a mano dentro de carpeta.
subimos archivo al stage git add --all
vemos con git status
hacemos commits, git commit -m "mensaje"
vemos con git status
creamos repositorio a mano en github
conectamos con con local, git remote origin add origin...
hacemos push, git push origin master.
-o-
modifico archivo de texto local
añado a stage, git add --all
realizo commit
subo a remoto, git push origin master
-o-
modifico archivo desde remoto,guardo
hago pull origin master, desde consola
arhivo modificado, ok!
-o-
creo archivo2 nuevo en local con texto dentro
creo rama, git branch mirama
me muevo a mirama, git switch
añado archivo2, git add --all
me muevo a master, git switch
fusiono ramas, git merge mirama
subo a remoto, git push origin master
-o-
	CONFLICTO
		modifico un archivo de una rama en el remoto (ejemplo git git otro compañero lo modifica)
		modifico el mismo archivo en la misma rama en el local
		me muevo a dicha rama, la añado a stage, lo subo al local y lo subo al remoto
			git switch "master"
			git add --all
			git commit --m "conflicto"
			git push origin master
		se crea el conflicto al subirlo, no se deja subir
		lo descargo con pull 
			git pull origin master
		decidimos que lineas del archivo dejamos, las mias o las del remoto
		la añado a stage, lo subo al local y al remoto
			git add --all
			git commit --m "confligitcto arreglado"
			git push origin master
		si da error forzamos
			git push --force origin master
**************************************************************************************************************

	CREAR RAMAS EN EL REPOSITORIO REMOTO Y DESCARGARLAS AL REPOSITORIO LOCAL
		se descarga el repositorio y todas las ramas que no tenemos en local
		git fetch origin
		git pull master
		git pull mirama
		git switch 
************************************************************************************************************
	
	CREAR UN REPOSITORIO EN EL REMOTO POR COMANDO
		echo "# segundorepositorio" >> README.md
		git init
		git add README.md
		git commit -m "first commit"
		git branch -M main
		git remote add origin https://github.com/apadlop724/segundorepositorio.git
		git push -u origin main
************************************************************************************************************
	ENVIAR UN REPOSITORIO EXISTENTE POR COMANDO
		git remote add origin https://github.com/apadlop724/segundorepositorio.git
		git branch -M main
		git push -u origin main
************************************************************************************************************
		

COMANDOS
Nombre y Email
git config --global user.name “Antonio Padilla Lopez”
git config --global user.email “apadlop724@g.educaand.es"

cd repositorio
git init

asociar repositorio local con remoto
git remote add origin https://github.com/apadlop724/Mirepositorio.git 

git config -l
git status
git log
git log --oneline --graph --decorate --all

subir
git add –all
git commit -m "Mi primer commit"
git push origin master

bajar
git pull origin master

comprobar en qué rama nos encontramos
git branch

crear una nueva rama
git branch "mirama"

movernos entre ramas
git switch "mirama"
git checkout (-b) "mirama"

fucionar ramas, me situo en el proyecto principal master
git switch "master"

fuciono miarama en la rama principal master
git merge "mirama"

si quiere modifica un archivo en mirama y quieres fucionar todo
mueve a mirama, modifica el archivo, mueve a la rama principal y hace un merge de mirama
git switch "mirama"
modifica
git switch "master"
git merge "mirama"

si modifica un archivo que ya estaba hecho un commit
git restore
y siga el paso anterior

sacar un archivo del stage y volver al estado modificado
git reset "archivo"

borrar archivos no rastreados por git
git clean

descargar todo
git fetch origin
git switch master
git switch mirama
git switch otrarama

git pull master
git pull mirama

git clone <URL_DEL_REPOSITORIO> <NOMBRE_DE_LA_CARPETA>
git clone https://github.com/apadlop724/Mirepositorio.git
git clone https://github.com/apadlop724/Mirepositorio.git carpeta
