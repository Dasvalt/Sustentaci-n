
package booksoft;

import java.util.Scanner;

public class Booksoft {

    
    public static void main(String[] args) {
        Catalogo ctlg[]=new Catalogo[100];        
        Prestamos prest[]=new Prestamos[100];
        
        int opc,opc1,catcont=0, band=0, pcont=0;
        int opc2;
        String name,cedula, vacio=("vacio");
        Scanner lector=new Scanner(System.in);
        do{
        System.out.println("\n\n::::SISTEMA DE BIBLIOTECAS DANIEL ORTIZ::::");
        System.out.println("1. MODULO DE GESTION DEL CATALOGO BIBLIOGRAFICO");
        System.out.println("2. MODULO PRESTAMOS");
        System.out.println("3. SALIR");
        opc=lector.nextInt();
        //PRIMER SWITHC DONDE SE ELIGE EL MODULO
        switch(opc){
            
            case 1:
               
        System.out.println("\n\nMODULO DE GESTION DEL CATALOGO BIBLIOGRAFICO");
        System.out.println("1. Ingresar material al catalogo.");
        System.out.println("2. Actualizar material del catalogo");
        System.out.println("3. Eliminar material del catalogo");
        System.out.println("4. Buscar en catalogo");
        System.out.println("Digite una opción");
        opc1=lector.nextInt();
        
        
                switch (opc1){
        
            case 1:
                if(catcont<99){
                    
        ctlg[catcont]=new Catalogo();
        System.out.println("::IMPORTANTE:Los campos NO deben tener espacios::");
        System.out.println("Ingrese nombre del libro");
        ctlg[catcont].setNombre(lector.next());
        
        System.out.println("Ingrese autor del libro");
        ctlg[catcont].setAutor(lector.next());
        
        System.out.println("Ingrese año de publicacion");
        ctlg[catcont].setAño(lector.next());
        
        System.out.println("Ingrese codigo del libro");
        ctlg[catcont].setCodigo(lector.next());
        
        System.out.println("Ingrese cantidad de ejemplares");
        ctlg[catcont].setCantidad(lector.next());
        
        System.out.println("Ingrese area (Quimica, Fisica, Tecnologia, calculo ó programación.)");
        ctlg[catcont].setArea(lector.next());
        catcont++;
                }else{System.out.println("MEMORIA LLENA");}
                
          break;
          
          
          
          
          
            case 2:
                 
                System.out.println("Actualizar Datos");
                 System.out.println("Ingrese nombre del libro a actualizar");                      
                              name=lector.next();
                              for(int i=0;i<catcont;i++){
                              if(name.equals(ctlg[i].getNombre())){
                                  band=1;
                   
                   System.out.println("Ingrese nombre del libro");
        ctlg[i].setNombre(lector.next());
        
        System.out.println("Ingrese autor del libro");
        ctlg[i].setAutor(lector.next());
        
        System.out.println("Ingrese año de publicacion");
        ctlg[i].setAño(lector.next());
        
        System.out.println("Ingrese codigo del libro");
        ctlg[i].setCodigo(lector.next());
        
        System.out.println("Ingrese cantidad de ejemplares");
        ctlg[i].setCantidad(lector.next());
        
        System.out.println("Ingrese area (Quimica, Fisica, Tecnologia, calculo ó programación.)");
        ctlg[i].setArea(lector.next());
                   
                              }
                              
                             
                              };
                              if(band==0)
                              System.out.println("No se encontraron resultados");
                              else band=0;
                              break;







                              
            case 3:
                
                System.out.println("BORRAR DATOS");
                System.out.println("Ingrese el nombre del libro que desea borrar");                      
                              name=lector.next();
                              for(int i=0;i<catcont;i++){
                              if(name.equals(ctlg[i].getNombre())){
                              ctlg[i].setNombre(vacio);
                              ctlg[i].setAutor(vacio);
                              ctlg[i].setAño(vacio);
                              ctlg[i].setCodigo(vacio);
                              ctlg[i].setCantidad(vacio);
                              ctlg[i].setArea(vacio);
                              catcont--;
                                  
                 System.out.println("::BORRADO EXITOSO::");                
                              }
                              }
                
                break;
               
                
                
                
                
                
                
                
            case 4:
                System.out.println("BUSCAR LIBRO");
                 System.out.println("Ingrese nombre de su busqueda");                      
                              name=lector.next();
                              for(int i=0;i<catcont;i++){
                              if(name.equals(ctlg[i].getNombre())){
        band=1;                          
        System.out.println("\n\n:::::::::::::::::::::::::::::");                           
        System.out.println("::Nombre:" +ctlg[i].getNombre());
        System.out.println("::Autor:" +ctlg[i].getAutor());
        System.out.println("::Año de publicación:" +ctlg[i].getAño());
        System.out.println("::Codigo:" +ctlg[i].getCodigo());
        System.out.println("::Cantidad de ejemplares:" +ctlg[i].getCantidad());
        System.out.println("::Area:" +ctlg[i].getArea());
        System.out.println("::::::::::::::::::::::::::::::\n\n");                      
                              }
                              }
                             if(band==0)
                              System.out.println("No se encontraron resultados");
                             band=0;
                      break;
                              
           
                              
                              
                              
                              
                              
                              
                              
            default:
                System.out.println("INGRESE UN OPCIÓN VÁLIDA");
                break;
                               
        
        
                     
                
                
        }
        
        
        
       break;
        
            case 2:
                System.out.println("MODULO PRESTAMOS");
                System.out.println("1. Prestar libro.");
                System.out.println("2. Devolver libro");
                System.out.println("3. Libros prestados");
                System.out.println("Digite una opción");
                opc2=lector.nextInt();
               
               switch(opc2){
            
            case 1:
                if(pcont<99){
                prest[pcont]=new Prestamos();
                System.out.println("\nPRESTAR LIBRO");
                System.out.println("Ingrese su numero de documento"); 
                cedula=lector.next();
                System.out.println("Ingrese su busqueda");                      
                              name=lector.next();
                              for(int i=0;i<catcont;i++){
                                  
                              if(name.equals(ctlg[i].getNombre())){
                                  band=1;
                                  prest[pcont].setNombre(ctlg[i].getNombre());
                                  prest[pcont].setAutor(ctlg[i].getAutor());
                                  prest[pcont].setAño(ctlg[i].getAño());
                                  prest[pcont].setCodigo(ctlg[i].getCodigo());
                                  prest[pcont].setCantidad(ctlg[i].getCantidad());
                                  prest[pcont].setArea(ctlg[i].getArea());
                                  prest[pcont].setCedula(cedula);
                                  pcont++;
                                  
                                  ctlg[i].setNombre(vacio);
                                  ctlg[i].setAutor(vacio);
                                  ctlg[i].setAño(vacio);
                                  ctlg[i].setCodigo(vacio);
                                  ctlg[i].setCantidad(vacio);
                                  ctlg[i].setArea(vacio);          
                                   
                              System.out.println("::PRESTAMO EXITOSO::\n");   
                            
                              }
                              if(band==0)
                            
                             System.out.println(":::El libro no se encuentra en el catalogo:::\n");
                              band=0;
                              }
                             
                             
                }
                      break;
                      
            case 2:
                
                System.out.println("\nDEVOLVER LIBRO");
     
                System.out.println("Ingrese el nombre del libro que quiere devolver");                      
                              name=lector.next();
                              for(int i=0;i<pcont;i++){
                                  
                              if(name.equals(prest[i].getNombre())){
                                  
                                  for(int j=0;j<catcont;j++){
                                  if(ctlg[j].getNombre().equals(vacio)){
                                      
                                      ctlg[j].setNombre(prest[i].getNombre());
                                      ctlg[j].setAutor(prest[i].getAutor());
                                      ctlg[j].setAño(prest[i].getAño());
                                      ctlg[j].setCodigo(prest[i].getCodigo());
                                      ctlg[j].setCantidad(prest[i].getCantidad());
                                      ctlg[j].setArea(prest[i].getArea());
                                      pcont--;
                                      
                                  prest[i].setNombre(vacio);
                                  prest[i].setAutor(vacio);
                                  prest[i].setAño(vacio);
                                  prest[i].setCodigo(vacio);
                                  prest[i].setCantidad(vacio);
                                  prest[i].setArea(vacio);
                                  prest[i].setCedula(vacio);
                                      
                                       
                                  System.out.println("::DEVOLUCION EXITOSA::\n");   
                                  
                                  }
                                  
                                  }
                                  
                                  
                              }}
                
            case 3:
                
                 System.out.println("\n\nLIBROS PRESTADOS");
                 
                              for(int i=0;i<pcont;i++){
         band=1;                    
        System.out.println("::::::::::::::::::::::");                           
        System.out.println("::Nombre:" +prest[i].getNombre());
        System.out.println("::Autor:" +prest[i].getAutor());
        System.out.println("::Año de publicación:" +prest[i].getAño());
        System.out.println("::Codigo:" +prest[i].getCodigo());
        System.out.println("::Cantidad de ejemplares:" +prest[i].getCantidad());
        System.out.println("::Area:" +prest[i].getArea());
        System.out.println("::Identidicación del usuario:" +prest[i].getCedula());
        System.out.println(":::::::::::::::::::::::\n\n");                      
                              
                              } if (band==0)
                                System.out.println("Usted no tiene libros prestados\n\n");
                                band=0;
                              break;
                              
                
        
        default:
                System.out.println("INGRESE UN OPCIÓN VÁLIDA\n");
                break;
                      
        
        }
                
        }
        
        //SEGUNDO SWITCH PARA ELEGIR INGRESO DE MATERIAL
        

        
        //*******************************************************************
   
        
        
            
        
        
        
        
        
        
    }while(opc!=3);
        
       System.out.println("GRACIAS");
    
}
}
