package com.kovanlabs.intern.oops;

interface Plugin {

    void execute();
}

class CoreSystem{

    private Plugin[] plugins;

    public CoreSystem(Plugin[] plugins){
        this.plugins = plugins;
    }

    public void run(){
        for(Plugin plugin : plugins){
            plugin.execute();
        }
    }
}

public class PluginDemo{
    public static void main(String[] args){

        Plugin[] plugin1 = {
                new Plugin() {
                    @Override
                    public void execute() {
                        System.out.println("Plugin 1");
                    }
                },

                new Plugin() {
                    @Override
                    public void execute() {
                        System.out.println("Plugin 2");
                    }
                }

        };

        CoreSystem coreSystem = new CoreSystem(plugin1);
        coreSystem.run();
    }
}
