/*
 *  Aurthor: Otto O Legon (Autogenerated in NetBeans with personal parameters, and edited)
 *  Project: RevYou Project
 *  Sub-Project: DBControls For Video
 *  Class: VideoDb
 *  Description: Entity class for relational database row
 */
package com.revyouviddb;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Otto
 */
@Entity
@Table(name = "video_db", catalog = "dd0cstm5kg94ae", schema = "public")
@NamedQueries({
    @NamedQuery(name = "VideoDb.findAll", query = "SELECT v FROM VideoDb v"),
    @NamedQuery(name = "VideoDb.findById", query = "SELECT v FROM VideoDb v WHERE v.id = :id"),
    @NamedQuery(name = "VideoDb.findByOwner", query = "SELECT v FROM VideoDb v WHERE v.owner = :owner"),
    @NamedQuery(name = "VideoDb.findByVideoUrl", query = "SELECT v FROM VideoDb v WHERE v.videoUrl = :videoUrl"),
    @NamedQuery(name = "VideoDb.findByVisibility", query = "SELECT v FROM VideoDb v WHERE v.visibility = :visibility"),
    @NamedQuery(name = "VideoDb.findByDescription", query = "SELECT v FROM VideoDb v WHERE v.description = :description"),
    @NamedQuery(name = "VideoDb.findByVideoName", query = "SELECT v FROM VideoDb v WHERE v.videoName = :videoName"),
    @NamedQuery(name = "VideoDb.findByTags", query = "SELECT v FROM VideoDb v WHERE v.tags = :tags"),
    @NamedQuery(name = "VideoDb.findByCommentsUrl", query = "SELECT v FROM VideoDb v WHERE v.commentsUrl = :commentsUrl")
    })
public class VideoDb implements Serializable {
    /**
     * 
     */
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    /**
     * 
     */
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Short id;
    /**
     * 
     */
    @Basic(optional = false)
    @Column(name = "owner")
    private String owner;
    /**
     * 
     */
    @Basic(optional = false)
    @Column(name = "video_url")
    private String videoUrl;
    /**
     * 
     */
    @Basic(optional = false)
    @Column(name = "visibility")
    private boolean visibility;
    /**
     * 
     */
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    /**
     * 
     */
    @Basic(optional = false)
    @Column(name = "video_name")
    private String videoName;
    /**
     * 
     */
    @Basic(optional = true)
    @Column(name = "tags")
    private String tags;
    /**
     * 
     */
    @Basic(optional = true)
    @Column(name = "comments_url")
    private String commentsUrl;

    /**
     * 
     */
    public VideoDb() {
    }

    /**
     * @param id
     */
    public VideoDb(Short id) {
        this.id = id;
    }

    /**
     * @param id
     * @param owner
     * @param videoUrl
     * @param visibility
     * @param description
     * @param videoName
     * @param tags
     * @param commentsUrl
     */
    public VideoDb(Short id, String owner, String videoUrl, boolean visibility, String description, String videoName, String tags, String commentsUrl) {
        this.id = id;
        this.owner = owner;
        this.videoUrl = videoUrl;
        this.visibility = visibility;
        this.description = description;
        this.videoName = videoName;
        this.tags = tags;
        this.commentsUrl = commentsUrl;
    }

    /**
     * @return
     */
    public Short getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Short id) {
        Short oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    /**
     * @return
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner
     */
    public void setOwner(String owner) {
        String oldOwner = this.owner;
        this.owner = owner;
        changeSupport.firePropertyChange("owner", oldOwner, owner);
    }

    /**
     * @return
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    /**
     * @param videoUrl
     */
    public void setVideoUrl(String videoUrl) {
        String oldVideoUrl = this.videoUrl;
        this.videoUrl = videoUrl;
        changeSupport.firePropertyChange("videoUrl", oldVideoUrl, videoUrl);
    }

    /**
     * @return
     */
    public boolean getVisibility() {
        return visibility;
    }

    /**
     * @param visibility
     */
    public void setVisibility(boolean visibility) {
        boolean oldVisibility = this.visibility;
        this.visibility = visibility;
        changeSupport.firePropertyChange("visibility", oldVisibility, visibility);
    }

    /**
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        String oldDescription = this.description;
        this.description = description;
        changeSupport.firePropertyChange("description", oldDescription, description);
    }
    
    /**
     * @return
     */
    public String getVideoName() {
        return videoName;
    }

    /**
     * @param videoName
     */
    public void setVideoName(String videoName) {
        String oldDescription = this.videoName;
        this.videoName = videoName;
        changeSupport.firePropertyChange("videoName", oldDescription, videoName);
    }
    
    /**
     * @return
     */
    public String getTags() {
        return tags;
    }

    /**
     * @param tags
     */
    public void setTags(String tags) {
        String oldDescription = this.tags;
        this.tags = tags;
        changeSupport.firePropertyChange("tags", oldDescription, tags);
    }
    
    /**
     * @return
     */
    public String getCommentsUrl() {
        return commentsUrl;
    }

    /**
     * @param commentsUrl
     */
    public void setCommentsUrl(String commentsUrl) {
        String oldDescription = this.commentsUrl;
        this.commentsUrl = commentsUrl;
        changeSupport.firePropertyChange("commentsUrl", oldDescription, commentsUrl);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VideoDb)) {
            return false;
        }
        VideoDb other = (VideoDb) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return videoName;
    }

    /**
     * @param listener
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    /**
     * @param listener
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
