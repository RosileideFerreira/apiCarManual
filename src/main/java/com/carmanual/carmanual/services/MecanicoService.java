package com.carmanual.carmanual.services;
import com.carmanual.carmanual.models.Mecanico;
import com.carmanual.carmanual.repositories.MecanicoRepository;
import com.carmanual.carmanual.repositories.PlanoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class MecanicoService {
    private final MecanicoRepository repo; private final PlanoRepository planoRepo;
    public MecanicoService(MecanicoRepository repo, PlanoRepository planoRepo){this.repo=repo;this.planoRepo=planoRepo;}
    public List<Mecanico> listar(){return repo.findAll();}
    public Mecanico buscar(Long id){return repo.findById(id).orElseThrow();}
    public Mecanico salvar(Mecanico m, Long idPlan){
        if(idPlan != null) m.setPlano(planoRepo.findById(idPlan).orElseThrow());
        return repo.save(m);
    }
    public Mecanico atualizar(Long id,Mecanico m){m.setId(id);return repo.save(m);}
    public void excluir(Long id){repo.deleteById(id);}
    public List<Mecanico> porPlano(Long id){return repo.findByPlanoId(id);}
}
