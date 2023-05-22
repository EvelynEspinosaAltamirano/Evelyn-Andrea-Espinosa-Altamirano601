package  {
	
	import flash.display.MovieClip;
	
	
	public class setup extends MovieClip {//firma
		private var fondo_new: fondo = new fondo();// variables de clase
		
		private var piso_new:piso =new piso();
		private var protagonista_new:protagonista = new protagonista();
		
		private var antagonista_new:antagonista = new antagonista();
		
		public function setup() {//codigo constructor
			// constructor code
		
		addChild(fondo_new);
		addChild(piso_new);
		
		addChild(protagonista_new);
		
		addChild(antagonista_new);
		
		fondo_new.y=200;
		fondo_new.x=275;
		
		piso_new.y=385;
		piso_new.x=275;
		
		
		protagonista_new.y=340;
		protagonista_new.x=275;
		
		antagonista_new.y=70;
		antagonista_new.y=275;
		
		}
	}
	
}
