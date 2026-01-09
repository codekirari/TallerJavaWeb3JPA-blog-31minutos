//package com.example.blogejercicio.repository;
//
//import com.example.blogejercicio.model.Posteo;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class PosteoRepository implements IposteoRepository {
//
//    private final List<Posteo> posteos = new ArrayList<>();
//
//    public PosteoRepository() {
//        posteos.add(new Posteo(1L, "Quiero hacer mi show", "Maguito"));
//        posteos.add(new Posteo(2L, "Nunca quedas mal con nadie", "Juanín"));
//    }
//
//    @Override
//    public List<Posteo> findAll() {
//        return posteos;
//    }
//
//    @Override
//    public Posteo findById(Long id) {
//        for (Posteo posteo : posteos) {
//            if (posteo.getId_Posteo().equals(id)) {
//                return posteo;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public void save(Posteo posteo) {
//        posteos.add(posteo);
//    }
//}
