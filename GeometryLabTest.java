public class GeometryLabTest {
    public static void main(String[] args){
        GeometryLab geo = new GeometryLab();
        // basic algebra
        
        System.out.println (geo.f(2,3)); // #1
        System.out.println (geo.f(4,8)); //#2
        System.out.println (geo.g(3,5)); //#3
        System.out.println (geo.g(5,3)); //#4
        System.out.println (geo.h(2,9)); //#5
        System.out.println (geo.h(4,10)); //#6
        System.out.println (geo.j(5,10)); //#7
        System.out.println (geo.j(10,5)); //#8
        System.out.println (geo.k(9,7)); //#9
        System.out.println (geo.k(7,9)); //#10
        System.out.println (geo.m(3,4,5)); //#11
        System.out.println (geo.m(4,6,3)); //#12
        System.out.println (geo.f(geo.g(3,5), geo.k(7,9))); //#13
        System.out.println (geo.f(geo.j(10,5), geo.h(2,9))); //#14
        System.out.println (geo.g(geo.m(3,4,5), geo.h(4,10))); //#15
        System.out.println (geo.g(geo.j(5,10), geo.f(2,3))); //#16
        System.out.println (geo.h(geo.m(4,6,3), geo.f(4,8)));
        System.out.println (geo.h(geo.k(9,7), geo.g(5,3)));
        System.out.println (geo.j(geo.k(7,9), geo.g(3,5)));
        System.out.println (geo.j(geo.h(2,9), geo.m(4,6,3)));  
        System.out.println (geo.k(geo.m(3,4,5), geo.j(10,5)));  
        System.out.println (geo.k(geo.k(9,7), geo.f(4,8)));
        System.out.println (geo.m(geo.h(4,10), geo.f(2,3), geo.g(5,3)));  
        System.out.println (geo.m(geo.k(7,9),geo.j(5,10),geo.h(4,10))); 
        
        //geometry
        System.out.println (geo.triArea(2,3));
        System.out.println (geo.triArea(4,8));
        System.out.println (geo.trapArea(3,4,5));
        System.out.println (geo.trapArea(4,6,3));
        System.out.println (geo.rectArea(3,5));
        System.out.println (geo.rectArea(5,3));
        System.out.println (geo.circArea(7));
        System.out.println (geo.circArea(9));
        System.out.println (geo.paralArea(2,9));
        System.out.println (geo.paralArea(4,10));
        System.out.println (geo.pythHypotenuse(5,10));
        System.out.println (geo.pythHypotenuse(9,7));
        System.out.println (geo.triPrismVol(10,5,4));
        System.out.println (geo.triPrismVol(7,9,3));
        System.out.println (geo.rectPrismVol(2,3,4));
        System.out.println (geo.rectPrismVol(8,3,6));
        System.out.println (geo.rectPyramidVol(5,7,9));
        System.out.println (geo.rectPyramidVol(4,6,8));
        System.out.println (geo.cylVol(9,2));
        System.out.println (geo.cylVol(10,3));
        System.out.println (geo.sphereSurfArea(4));
        System.out.println (geo.sphereSurfArea(7));
        System.out.println (geo.cylSurfArea(4,7));
        System.out.println (geo.cylSurfArea(5,3));
        System.out.println (geo.rectPrismSurfArea(geo.pythHypotenuse(3,4),3, geo.k(13,5)));
        
        
        
   
    
}
}