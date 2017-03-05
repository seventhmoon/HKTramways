package com.androidfung.hktramways.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by fung on 3/5/2017.
 */
@Root(name="root")
public class Eta {

    @ElementList(inline = true, name = "metadata", required = false)
    List<Metadata> metadata;

    public List<Metadata> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<Metadata> metadata) {
        this.metadata = metadata;
    }
}
