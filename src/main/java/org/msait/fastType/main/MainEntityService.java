package org.msait.fastType.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MainEntityService {

    @Autowired
    MainEntityRepository mainEntityRepository;






}
