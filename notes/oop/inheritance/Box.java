class Box{
   double width;
   double height;
   double depth;

   Box(Box object){ // This constructor is called copy constructor.
       this.width = object.width;
       this.height = object.height;
       this.depth = object.depth;
   }

   Box(double width, double height, double depth){ // This constructor is called parameterized constructor.
       this.width = width;
       this.height = height;
       this.depth = depth;
   }

   Box(){ // This constructor is called default constuctor.

   }

   Box(double length){ // This gets envoked assuming box is a cube.
       this.width = this.height = this.depth = length;
   }

   double volume(){
       return width * height * depth;
   }
}