package be.tftic.galerieimage.dal.services;

import java.util.Optional;

public interface CrudService<TENTITY, TID> {

    Iterable<? extends TENTITY> getAll();
    Optional<TENTITY> getById(TID id);
    TENTITY create(TENTITY entity);
    TENTITY update(TENTITY entity, TID tid) throws Exception;
    boolean deleteByID(TID id);
}
