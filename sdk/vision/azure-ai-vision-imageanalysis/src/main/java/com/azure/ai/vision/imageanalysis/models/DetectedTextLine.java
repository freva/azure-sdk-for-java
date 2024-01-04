// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.imageanalysis.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Represents a single line of text in the image.
 */
@Immutable
public final class DetectedTextLine {

    /*
     * Text content of the detected text line.
     */
    @Generated
    @JsonProperty(value = "text")
    private String text;

    /*
     * A bounding polygon around the text line. At the moment only quadrilaterals are supported (represented by 4 image
     * points).
     */
    @Generated
    @JsonProperty(value = "boundingPolygon")
    private List<ImagePoint> boundingPolygon;

    /*
     * A list of words in this line.
     */
    @Generated
    @JsonProperty(value = "words")
    private List<DetectedTextWord> words;

    /**
     * Creates an instance of DetectedTextLine class.
     * 
     * @param text the text value to set.
     * @param boundingPolygon the boundingPolygon value to set.
     * @param words the words value to set.
     */
    @Generated
    @JsonCreator
    private DetectedTextLine(@JsonProperty(value = "text") String text,
        @JsonProperty(value = "boundingPolygon") List<ImagePoint> boundingPolygon,
        @JsonProperty(value = "words") List<DetectedTextWord> words) {
        this.text = text;
        this.boundingPolygon = boundingPolygon;
        this.words = words;
    }

    /**
     * Get the text property: Text content of the detected text line.
     * 
     * @return the text value.
     */
    @Generated
    public String getText() {
        return this.text;
    }

    /**
     * Get the boundingPolygon property: A bounding polygon around the text line. At the moment only quadrilaterals are
     * supported (represented by 4 image points).
     * 
     * @return the boundingPolygon value.
     */
    @Generated
    public List<ImagePoint> getBoundingPolygon() {
        return this.boundingPolygon;
    }

    /**
     * Get the words property: A list of words in this line.
     * 
     * @return the words value.
     */
    @Generated
    public List<DetectedTextWord> getWords() {
        return this.words;
    }
}
