package figurasOrdenables;


public abstract class Figuras
{
        public double base;
        public double altura;

        public  Figuras ()
    {   base=0;
        altura=0;
    }
        public  Figuras (double b, double h)
      {   base=b;
          altura=h;
      }
        public void setBase(double b)
    {   base=b;
    }
        public void setAltura (double h)
    {   altura=h;
    }
        public double getBase ()
        { return base;}
        public double getAltura ()
        {return altura;}
       
        public abstract double area();
            
}
