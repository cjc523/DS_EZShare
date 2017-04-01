/**
 * The class Resource is an entity used for storing resources records.
 * The constructor of the class requires the value of uri, because uri
 * is a compulsory element of a resource.
 * @author: Jiayu Wang
 * @date: April 1, 2017
 */
import java.util.ArrayList;


public class Resource {
    private String name = "";
    private String description = "";
    private ArrayList<String> tags = new ArrayList<>();
    private String uri;
    private String channel = "";
    private String owner = "";
    private String ezServer = "";

    //A URI is a compulsory element for resource.
    public Resource(String uri) {
        this.uri = uri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getEzServer() {
        return ezServer;
    }

    public void setEzServer(String ezServer) {
        this.ezServer = ezServer;
    }


}

