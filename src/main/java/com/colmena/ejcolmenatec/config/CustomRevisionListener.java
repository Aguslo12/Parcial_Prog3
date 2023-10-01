package com.colmena.ejcolmenatec.config;

import com.colmena.ejcolmenatec.entities.audit.Revision;
import org.hibernate.envers.RevisionListener;

/*
 * Un "Revision Listener" en el contexto de Hibernate Envers es una interfaz o clase que permite a los desarrolladores
 * personalizar y controlar el proceso de auditoría de revisiones en una aplicación Java. Cuando una entidad auditada se modifica,
 * Hibernate Envers registra automáticamente una revisión para llevar un registro de los cambios.
 */
public class CustomRevisionListener implements RevisionListener {
    public void newRevision(Object revisionEntity) {
        final Revision revision = (Revision) revisionEntity;
    }
}