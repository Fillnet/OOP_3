package Transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Transport> {
private String name;
private Queue<T> queue=new LinkedList<>();

    public ServiceStation(String name) {
        this.name = name;
    }

    public void addCarService(T transport) {
        queue.offer(transport);
    }

    public void techInspection() {
        T transport = queue.poll();
        if (transport != null) {
            System.out.println("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " находится на техобслуживании");
            techInspection();
        }else {
            System.out.println("Очередь пуста ");
        }
    }

    public String getName() {
        return name;
    }
}
