
package us.kbase.genomecomparison;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: BuildPangenomeParams</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "genomes",
    "genome_workspace",
    "workspace"
})
public class BuildPangenomeParams {

    @JsonProperty("genomes")
    private List<String> genomes;
    @JsonProperty("genome_workspace")
    private List<String> genomeWorkspace;
    @JsonProperty("workspace")
    private java.lang.String workspace;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("genomes")
    public List<String> getGenomes() {
        return genomes;
    }

    @JsonProperty("genomes")
    public void setGenomes(List<String> genomes) {
        this.genomes = genomes;
    }

    public BuildPangenomeParams withGenomes(List<String> genomes) {
        this.genomes = genomes;
        return this;
    }

    @JsonProperty("genome_workspace")
    public List<String> getGenomeWorkspace() {
        return genomeWorkspace;
    }

    @JsonProperty("genome_workspace")
    public void setGenomeWorkspace(List<String> genomeWorkspace) {
        this.genomeWorkspace = genomeWorkspace;
    }

    public BuildPangenomeParams withGenomeWorkspace(List<String> genomeWorkspace) {
        this.genomeWorkspace = genomeWorkspace;
        return this;
    }

    @JsonProperty("workspace")
    public java.lang.String getWorkspace() {
        return workspace;
    }

    @JsonProperty("workspace")
    public void setWorkspace(java.lang.String workspace) {
        this.workspace = workspace;
    }

    public BuildPangenomeParams withWorkspace(java.lang.String workspace) {
        this.workspace = workspace;
        return this;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public java.lang.String toString() {
        return ((((((((("BuildPangenomeParams"+" [genomes=")+ genomes)+", genomeWorkspace=")+ genomeWorkspace)+", workspace=")+ workspace)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
