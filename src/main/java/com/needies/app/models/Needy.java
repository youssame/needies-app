package com.needies.app.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity(name = "needies")
public class Needy {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
    private String id;

    private String name;

    // TODO: create an annotation to sluggify this
    @Column(unique = true)
    private String slug;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String image;

    @Column(name = "needed_amount")
    private Long neededAmount;

    @Column(name = "rest_amount")
    private Long restAmount;

    @CreationTimestamp
    @Column(name = "creation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @UpdateTimestamp
    @Column(name = "update_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;

    // it helps with serialization and deserialization when we use the data out of JSON
    public Needy() {
    }

    public Needy(String name, String slug, String description, String image, Long neededAmount, Long restAmount, Date creationDate, Date updateDate) {
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.image = image;
        this.neededAmount = neededAmount;
        this.restAmount = restAmount;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
    }

    public Needy(String id, String name, String slug, String description, String image, Long neededAmount, Long restAmount, Date creationDate, Date updateDate) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.image = image;
        this.neededAmount = neededAmount;
        this.restAmount = restAmount;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getNeededAmount() {
        return neededAmount;
    }

    public void setNeededAmount(Long neededAmount) {
        this.neededAmount = neededAmount;
    }

    public Long getRestAmount() {
        return restAmount;
    }

    public void setRestAmount(Long restAmount) {
        this.restAmount = restAmount;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }
}
