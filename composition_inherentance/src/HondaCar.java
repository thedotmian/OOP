public class HondaCar extends vehicle {
    private car_engine Honda_engine;
    
    public HondaCar(){
        Honda_engine=new car_engine(6,200 );
        Honda_engine.startEngine();
    }
}
