package com.kovanlabs.intern.exception;

class Resource implements AutoCloseable{


    void use(){
        System.out.println("Using Resource Method");
    }

    @Override
    public void close(){
        System.out.println("close runs automatically");
    }

}

public class TryWithResources {

    public static void main(String[] args) {


        try(Resource resource = new Resource();){
            resource.use();

            int a = 10/0;
        }catch(Exception e){
            System.out.println(e);
        }
    }


}
