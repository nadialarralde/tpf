
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import modelo.Empleado;
import modelo.Historial;
import modelo.Reclamo;
import modelo.TipoReclamo;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xx-gi
 */
public class mainPrueba {
    
    private static EntityManager manager;
    
    private static EntityManagerFactory emf;
    
    

    
    public static void main(String[]args) {
        
        emf=Persistence.createEntityManagerFactory("Persistence");
        manager=emf.createEntityManager();
        
          
//        Query query=manager.createQuery("FROM Historial");
//        List<Historial> list=query.getResultList();
//        List<Integer> ultimos=new ArrayList<>();
//        List<String> todos=new ArrayList<>();
//        List<Integer> todosInt=new ArrayList<>();
//        list.forEach((e) -> {
//            ultimos.add(Integer.parseInt(e.getEmpleadosAsignados().get(e.getEmpleadosAsignados().size()-1).substring(2, 10 )));
//            System.out.println(Integer.parseInt(e.getEmpleadosAsignados().get(e.getEmpleadosAsignados().size()-1).substring(0, 1 )));
//            todos.addAll(e.getEmpleadosAsignados());
//            System.out.println("ultima entrada en empleados asignados :"+e.getEmpleadosAsignados().get(e.getEmpleadosAsignados().size()-1));
//        });
//        todos.forEach((a)  ->{
//            todosInt.add(Integer.parseInt(a.substring(2, 10)));
//        });
//            System.out.println(ultimos);
//            System.out.println(todosInt);
//            int aux1=0 ,aux2 = 0, cont1=0 , cont2=0 ;
//            // seleccion del que menos reclamos asignados tenga ( osea el urgente)
//            for(int e:ultimos){
//                if(cont1 == 0){
//                    aux1 = e;
//                }else if(cont2 == 0){
//                    aux2=e;
//                    }else if(cont1 <= cont2){
//                        aux2=e;
//                        cont2=0;
//                        }else{
//                        aux1=aux2;
//                        cont1=cont2;
//                        aux2=e;
//                        cont2=0; 
//                        }
//                for(int a:ultimos){
//                    if(aux2 == 0){
//                        if(aux1 == a){
//                            cont1++;
//                        }
//                    }else{
//                        if(aux2 == a){
//                            cont2++;
//                        }
//                    }
//                }
//        }
//            System.out.println("el empelado con menos reclamos es:"+aux1);
//            for(int e:todosInt){
//                if(cont1 == 0){
//                    aux1 = e;
//                }else if(cont2 == 0){
//                    aux2=e;
//                    }else if(cont1 >= cont2){
//                        aux2=e;
//                        cont2=0;
//                        }else{
//                        aux1=aux2;
//                        cont1=cont2;
//                        aux2=e;
//                        cont2=0; 
//                        }
//                for(int a:todosInt){
//                    if(aux2 == 0){
//                        if(aux1 == a){
//                            cont1++;
//                        }
//                    }else{
//                        if(aux2 == a){
//                            cont2++;
//                        }
//                    }
//                }
//        }
//            System.out.println("el empelado con mas reclamos es:"+aux1);
            

        //TipoReclamo tr = new TipoReclamo ("master en todo");
        /* manager.getTransaction().begin();
        manager.persist(tr);
        manager.getTransaction().commit();*/
        
        
        Query query=manager.createQuery("FROM Reclamo r ORDER BY r.fecha");
        List<Reclamo>ordenados=query.getResultList(); 
        for(Reclamo e:ordenados){
            System.out.println("NumeroReclamo: "+e.getIdReclamo()+" Urgencia: "+e.getUrgencia()+" Fecha: "+e.getFecha()+" Estado: "+e.getHistorial().getEstado().getDescripcion());
        }
        
    }
    
    private static void imprimirTodo(){
        
        
        
    }




    
    
    
}
