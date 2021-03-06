package de.kontext_e.jqassistant.plugin.git.store.descriptor;

import com.buschmais.jqassistant.core.store.api.model.Descriptor;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Property;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * A Git Branch (either remote or local).
 *
 * @author Gerd Aschemann - gerd@aschemann.net - @GerdAschemann
 * @since 1.1.0
 */
@Label("Branch")
public interface GitBranchDescriptor extends GitDescriptor {
    @Property("name")
    public String getName();
    public void setName(String name);

    @Relation("HAS_HEAD")
    public GitCommitDescriptor getHead();
    public void setHead(GitCommitDescriptor commit);
}
