package lombokexperement;

import lombokexperement.dto.User;
import lombokexperement.dto.UserLombok;
import lombokexperement.dto.UserWith;

public class MainLombok {
   public  static  void  main(String[]args){
       User user =new User("aaa","rrrrr") ;
       System.out.println("user:"+user.getName());

       UserWith userWith= new UserWith();
 userWith.withName("ret");
 userWith.withPasswor("retrtyt");
       System.out.println(userWith.getPasswor()+"user with ");

       UserWith userWith1=new UserWith()
       .withName("hjh")
       .withPasswor("yfgh");
       System.out.println("user With1"+userWith1.getName());

       UserWith userWith2 = new UserWith()
               .withPasswor("fgfgh");
       //=============== Lombok========

       UserLombok userLombok = UserLombok.builder()
       .name("ggggggg")
        .password("gggggggg").build();
       System.out.println("User Lombok  "+userLombok.getName()+ " "+userLombok.getPassword());

   }

}
