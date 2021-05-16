
package com.example.gatetes.Clases;



import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Gatetes implements Parcelable {

    @SerializedName("weight")
    @Expose
    private Weight weight;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("cfa_url")
    @Expose
    private String cfaUrl;
    @SerializedName("vetstreet_url")
    @Expose
    private String vetstreetUrl;
    @SerializedName("vcahospitals_url")
    @Expose
    private String vcahospitalsUrl;
    @SerializedName("temperament")
    @Expose
    private String temperament;
    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("country_codes")
    @Expose
    private String countryCodes;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("life_span")
    @Expose
    private String lifeSpan;
    @SerializedName("indoor")
    @Expose
    private int indoor;
    @SerializedName("lap")
    @Expose
    private int lap;
    @SerializedName("alt_names")
    @Expose
    private String altNames;
    @SerializedName("adaptability")
    @Expose
    private int adaptability;
    @SerializedName("affection_level")
    @Expose
    private int affectionLevel;
    @SerializedName("child_friendly")
    @Expose
    private int childFriendly;
    @SerializedName("dog_friendly")
    @Expose
    private int dogFriendly;
    @SerializedName("energy_level")
    @Expose
    private int energyLevel;
    @SerializedName("grooming")
    @Expose
    private int grooming;
    @SerializedName("health_issues")
    @Expose
    private int healthIssues;
    @SerializedName("intelligence")
    @Expose
    private int intelligence;
    @SerializedName("shedding_level")
    @Expose
    private int sheddingLevel;
    @SerializedName("social_needs")
    @Expose
    private int socialNeeds;
    @SerializedName("stranger_friendly")
    @Expose
    private int strangerFriendly;
    @SerializedName("vocalisation")
    @Expose
    private int vocalisation;
    @SerializedName("experimental")
    @Expose
    private int experimental;
    @SerializedName("hairless")
    @Expose
    private int hairless;
    @SerializedName("natural")
    @Expose
    private int natural;
    @SerializedName("rare")
    @Expose
    private int rare;
    @SerializedName("rex")
    @Expose
    private int rex;
    @SerializedName("suppressed_tail")
    @Expose
    private int suppressedTail;
    @SerializedName("short_legs")
    @Expose
    private int shortLegs;
    @SerializedName("wikipedia_url")
    @Expose
    private String wikipediaUrl;
    @SerializedName("hypoallergenic")
    @Expose
    private int hypoallergenic;
    @SerializedName("reference_image_id")
    @Expose
    private String referenceImageId;
    @SerializedName("image")
    @Expose
    private Image image;

    public Gatetes(Weight weight, String id, String name, String cfaUrl, String vetstreetUrl, String vcahospitalsUrl, String temperament, String origin, String countryCodes, String countryCode, String description, String lifeSpan, int indoor, int lap, String altNames, int adaptability, int affectionLevel, int childFriendly, int dogFriendly, int energyLevel, int grooming, int healthIssues, int intelligence, int sheddingLevel, int socialNeeds, int strangerFriendly, int vocalisation, int experimental, int hairless, int natural, int rare, int rex, int suppressedTail, int shortLegs, String wikipediaUrl, int hypoallergenic, String referenceImageId, Image image) {
        super();
        this.weight = weight;
        this.id = id;
        this.name = name;
        this.cfaUrl = cfaUrl;
        this.vetstreetUrl = vetstreetUrl;
        this.vcahospitalsUrl = vcahospitalsUrl;
        this.temperament = temperament;
        this.origin = origin;
        this.countryCodes = countryCodes;
        this.countryCode = countryCode;
        this.description = description;
        this.lifeSpan = lifeSpan;
        this.indoor = indoor;
        this.lap = lap;
        this.altNames = altNames;
        this.adaptability = adaptability;
        this.affectionLevel = affectionLevel;
        this.childFriendly = childFriendly;
        this.dogFriendly = dogFriendly;
        this.energyLevel = energyLevel;
        this.grooming = grooming;
        this.healthIssues = healthIssues;
        this.intelligence = intelligence;
        this.sheddingLevel = sheddingLevel;
        this.socialNeeds = socialNeeds;
        this.strangerFriendly = strangerFriendly;
        this.vocalisation = vocalisation;
        this.experimental = experimental;
        this.hairless = hairless;
        this.natural = natural;
        this.rare = rare;
        this.rex = rex;
        this.suppressedTail = suppressedTail;
        this.shortLegs = shortLegs;
        this.wikipediaUrl = wikipediaUrl;
        this.hypoallergenic = hypoallergenic;
        this.referenceImageId = referenceImageId;
        this.image = image;
    }

    protected Gatetes(Parcel in) {
        id = in.readString();
        name = in.readString();
        cfaUrl = in.readString();
        vetstreetUrl = in.readString();
        vcahospitalsUrl = in.readString();
        temperament = in.readString();
        origin = in.readString();
        countryCodes = in.readString();
        countryCode = in.readString();
        description = in.readString();
        lifeSpan = in.readString();
        indoor = in.readInt();
        lap = in.readInt();
        altNames = in.readString();
        adaptability = in.readInt();
        affectionLevel = in.readInt();
        childFriendly = in.readInt();
        dogFriendly = in.readInt();
        energyLevel = in.readInt();
        grooming = in.readInt();
        healthIssues = in.readInt();
        intelligence = in.readInt();
        sheddingLevel = in.readInt();
        socialNeeds = in.readInt();
        strangerFriendly = in.readInt();
        vocalisation = in.readInt();
        experimental = in.readInt();
        hairless = in.readInt();
        natural = in.readInt();
        rare = in.readInt();
        rex = in.readInt();
        suppressedTail = in.readInt();
        shortLegs = in.readInt();
        wikipediaUrl = in.readString();
        hypoallergenic = in.readInt();
        referenceImageId = in.readString();
    }

    public static final Creator<Gatetes> CREATOR = new Creator<Gatetes>() {
        @Override
        public Gatetes createFromParcel(Parcel in) {
            return new Gatetes(in);
        }

        @Override
        public Gatetes[] newArray(int size) {
            return new Gatetes[size];
        }
    };

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCfaUrl() {
        return cfaUrl;
    }

    public void setCfaUrl(String cfaUrl) {
        this.cfaUrl = cfaUrl;
    }

    public String getVetstreetUrl() {
        return vetstreetUrl;
    }

    public void setVetstreetUrl(String vetstreetUrl) {
        this.vetstreetUrl = vetstreetUrl;
    }

    public String getVcahospitalsUrl() {
        return vcahospitalsUrl;
    }

    public void setVcahospitalsUrl(String vcahospitalsUrl) {
        this.vcahospitalsUrl = vcahospitalsUrl;
    }

    public String getTemperament() {
        return temperament;
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getCountryCodes() {
        return countryCodes;
    }

    public void setCountryCodes(String countryCodes) {
        this.countryCodes = countryCodes;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(String lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public int getIndoor() {
        return indoor;
    }

    public void setIndoor(int indoor) {
        this.indoor = indoor;
    }

    public int getLap() {
        return lap;
    }

    public void setLap(int lap) {
        this.lap = lap;
    }

    public String getAltNames() {
        return altNames;
    }

    public void setAltNames(String altNames) {
        this.altNames = altNames;
    }

    public int getAdaptability() {
        return adaptability;
    }

    public void setAdaptability(int adaptability) {
        this.adaptability = adaptability;
    }

    public int getAffectionLevel() {
        return affectionLevel;
    }

    public void setAffectionLevel(int affectionLevel) {
        this.affectionLevel = affectionLevel;
    }

    public int getChildFriendly() {
        return childFriendly;
    }

    public void setChildFriendly(int childFriendly) {
        this.childFriendly = childFriendly;
    }

    public int getDogFriendly() {
        return dogFriendly;
    }

    public void setDogFriendly(int dogFriendly) {
        this.dogFriendly = dogFriendly;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int getGrooming() {
        return grooming;
    }

    public void setGrooming(int grooming) {
        this.grooming = grooming;
    }

    public int getHealthIssues() {
        return healthIssues;
    }

    public void setHealthIssues(int healthIssues) {
        this.healthIssues = healthIssues;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getSheddingLevel() {
        return sheddingLevel;
    }

    public void setSheddingLevel(int sheddingLevel) {
        this.sheddingLevel = sheddingLevel;
    }

    public int getSocialNeeds() {
        return socialNeeds;
    }

    public void setSocialNeeds(int socialNeeds) {
        this.socialNeeds = socialNeeds;
    }

    public int getStrangerFriendly() {
        return strangerFriendly;
    }

    public void setStrangerFriendly(int strangerFriendly) {
        this.strangerFriendly = strangerFriendly;
    }

    public int getVocalisation() {
        return vocalisation;
    }

    public void setVocalisation(int vocalisation) {
        this.vocalisation = vocalisation;
    }

    public int getExperimental() {
        return experimental;
    }

    public void setExperimental(int experimental) {
        this.experimental = experimental;
    }

    public int getHairless() {
        return hairless;
    }

    public void setHairless(int hairless) {
        this.hairless = hairless;
    }

    public int getNatural() {
        return natural;
    }

    public void setNatural(int natural) {
        this.natural = natural;
    }

    public int getRare() {
        return rare;
    }

    public void setRare(int rare) {
        this.rare = rare;
    }

    public int getRex() {
        return rex;
    }

    public void setRex(int rex) {
        this.rex = rex;
    }

    public int getSuppressedTail() {
        return suppressedTail;
    }

    public void setSuppressedTail(int suppressedTail) {
        this.suppressedTail = suppressedTail;
    }

    public int getShortLegs() {
        return shortLegs;
    }

    public void setShortLegs(int shortLegs) {
        this.shortLegs = shortLegs;
    }

    public String getWikipediaUrl() {
        return wikipediaUrl;
    }

    public void setWikipediaUrl(String wikipediaUrl) {
        this.wikipediaUrl = wikipediaUrl;
    }

    public int getHypoallergenic() {
        return hypoallergenic;
    }

    public void setHypoallergenic(int hypoallergenic) {
        this.hypoallergenic = hypoallergenic;
    }

    public String getReferenceImageId() {
        return referenceImageId;
    }

    public void setReferenceImageId(String referenceImageId) {
        this.referenceImageId = referenceImageId;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(name);
        dest.writeString(cfaUrl);
        dest.writeString(vetstreetUrl);
        dest.writeString(vcahospitalsUrl);
        dest.writeString(temperament);
        dest.writeString(origin);
        dest.writeString(countryCodes);
        dest.writeString(countryCode);
        dest.writeString(description);
        dest.writeString(lifeSpan);
        dest.writeInt(indoor);
        dest.writeInt(lap);
        dest.writeString(altNames);
        dest.writeInt(adaptability);
        dest.writeInt(affectionLevel);
        dest.writeInt(childFriendly);
        dest.writeInt(dogFriendly);
        dest.writeInt(energyLevel);
        dest.writeInt(grooming);
        dest.writeInt(healthIssues);
        dest.writeInt(intelligence);
        dest.writeInt(sheddingLevel);
        dest.writeInt(socialNeeds);
        dest.writeInt(strangerFriendly);
        dest.writeInt(vocalisation);
        dest.writeInt(experimental);
        dest.writeInt(hairless);
        dest.writeInt(natural);
        dest.writeInt(rare);
        dest.writeInt(rex);
        dest.writeInt(suppressedTail);
        dest.writeInt(shortLegs);
        dest.writeString(wikipediaUrl);
        dest.writeInt(hypoallergenic);
        dest.writeString(referenceImageId);
    }
}
