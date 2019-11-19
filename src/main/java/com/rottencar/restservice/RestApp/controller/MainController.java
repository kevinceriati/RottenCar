//package com.rottencar.restservice.RestApp.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//import com.rottencar.restservice.RestApp.form.CarForm;
//import com.rottencar.restservice.RestApp.model.Car;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//@Controller
//public class MainController {
//
//    private static List<Car> cars = new ArrayList<>();
//
//    static {
//
//    }
//
//    // Injectez (inject) via application.properties.
//    @Value("${welcome.message}")
//    private String message;
//
//    @Value("${error.message}")
//    private String errorMessage;
//
//    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
//    public String index(Model model) {
//
//        model.addAttribute("message", message);
//
//        return "index";
//    }
//
//    /**
//     *
//     * @param model
//     * @return carList
//     */
///*
//    @RequestMapping(value = { "/carList" }, method = RequestMethod.GET)
//    public String carList(Model model) {
//
//        model.addAttribute("cars", cars);
//
//        return "carList";
//    }
//*/
//
//    /**
//     *
//     * @param model
//     * @return addCar
//     */
//    @RequestMapping(value = { "/addCar" }, method = RequestMethod.GET)
//    public String showAddCarPage(Model model) {
//
//        CarForm carForm = new CarForm();
//        model.addAttribute("carForm", carForm);
//
//        return "addCar";
//    }
////
////    /**
////     * @param model
////     * @param carForm
////     * @return carList
////    @RequestMapping(value = { "/addCar" }, method = RequestMethod.POST)
////    public String saveCar(Model model, //
////                             @ModelAttribute("carForm") CarForm carForm) {
////
////        String name = carForm.getName();
////        String brand = carForm.getBrand();
////
////        if (name != null && name.length() > 0 //
////                && brand != null && brand.length() > 0) {
////            Car newCar = new Car(name, brand);
////            cars.add(newCar);
////
////            return "redirect:/carList";
////        }
////
////        model.addAttribute("errorMessage", errorMessage);
////        return "addCar";
////    }
//
//}
