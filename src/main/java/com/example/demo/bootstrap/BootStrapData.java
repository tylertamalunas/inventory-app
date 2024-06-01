package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;
    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
        this.inhousePartRepository = inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */

        OutsourcedPart wheel = new OutsourcedPart();
        wheel.setCompanyName("WGU");
        wheel.setName("Wheel");
        wheel.setInv(40);
        wheel.setPrice(5.0);
        wheel.setId(10L);

        OutsourcedPart blade = new OutsourcedPart();
        blade.setCompanyName("WGU");
        blade.setName("Blade");
        blade.setInv(10);
        blade.setPrice(50.0);
        blade.setId(11L);

        OutsourcedPart seat = new OutsourcedPart();
        seat.setCompanyName("WGU");
        seat.setName("Seat");
        seat.setInv(10);
        seat.setPrice(25.0);
        seat.setId(12L);

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        InhousePart throttle = new InhousePart();
        throttle.setName("Throttle");
        throttle.setInv(10);
        throttle.setPrice(30.0);
        throttle.setId(20L);

        InhousePart clippingsCollector = new InhousePart();
        clippingsCollector.setName("Clippings collector");
        clippingsCollector.setInv(10);
        clippingsCollector.setPrice(25.0);
        clippingsCollector.setId(21L);

        List<InhousePart> inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();
        for(InhousePart part:inhouseParts){
            System.out.println(part.getName());
        }

        Product gasPushMower = new Product("Gas push mower",125.0,15);
        Product electricPushMower = new Product("Electric push mower",200.0,15);
        Product lawnTractor = new Product("Lawn tractor",1000.0,15);
        Product zeroTurnMower = new Product("Zero turn mower",2500.0,15);
        Product rearEngineMower = new Product("Rear engine mower",1800.0,15);
        if (productRepository.count()==0 && outsourcedPartRepository.count()==0) {
            productRepository.save(gasPushMower);
            productRepository.save(electricPushMower);
            productRepository.save(lawnTractor);
            productRepository.save(zeroTurnMower);
            productRepository.save(rearEngineMower);
            outsourcedPartRepository.save(wheel);
            outsourcedPartRepository.save(blade);
            outsourcedPartRepository.save(seat);
            inhousePartRepository.save(throttle);
            inhousePartRepository.save(clippingsCollector);
        }


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
