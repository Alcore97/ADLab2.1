
package org.me.image;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.image package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SearchbyCreaDate_QNAME = new QName("http://image.me.org/", "SearchbyCreaDate");
    private final static QName _ListImages_QNAME = new QName("http://image.me.org/", "ListImages");
    private final static QName _SearchByTitleResponse_QNAME = new QName("http://image.me.org/", "SearchByTitleResponse");
    private final static QName _RegisterImageResponse_QNAME = new QName("http://image.me.org/", "RegisterImageResponse");
    private final static QName _ListImagesResponse_QNAME = new QName("http://image.me.org/", "ListImagesResponse");
    private final static QName _SearchbyId_QNAME = new QName("http://image.me.org/", "SearchbyId");
    private final static QName _SearchbyAuthor_QNAME = new QName("http://image.me.org/", "SearchbyAuthor");
    private final static QName _ModifyImage_QNAME = new QName("http://image.me.org/", "ModifyImage");
    private final static QName _SearchbyIdResponse_QNAME = new QName("http://image.me.org/", "SearchbyIdResponse");
    private final static QName _SearchbyKeywordsResponse_QNAME = new QName("http://image.me.org/", "SearchbyKeywordsResponse");
    private final static QName _SearchByTitle_QNAME = new QName("http://image.me.org/", "SearchByTitle");
    private final static QName _SearchbyCreaDateResponse_QNAME = new QName("http://image.me.org/", "SearchbyCreaDateResponse");
    private final static QName _SearchbyAuthorResponse_QNAME = new QName("http://image.me.org/", "SearchbyAuthorResponse");
    private final static QName _SearchbyKeywords_QNAME = new QName("http://image.me.org/", "SearchbyKeywords");
    private final static QName _RegisterImage_QNAME = new QName("http://image.me.org/", "RegisterImage");
    private final static QName _ModifyImageResponse_QNAME = new QName("http://image.me.org/", "ModifyImageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.image
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchByTitleResponse }
     * 
     */
    public SearchByTitleResponse createSearchByTitleResponse() {
        return new SearchByTitleResponse();
    }

    /**
     * Create an instance of {@link RegisterImageResponse }
     * 
     */
    public RegisterImageResponse createRegisterImageResponse() {
        return new RegisterImageResponse();
    }

    /**
     * Create an instance of {@link ListImagesResponse }
     * 
     */
    public ListImagesResponse createListImagesResponse() {
        return new ListImagesResponse();
    }

    /**
     * Create an instance of {@link SearchbyId }
     * 
     */
    public SearchbyId createSearchbyId() {
        return new SearchbyId();
    }

    /**
     * Create an instance of {@link SearchbyAuthor }
     * 
     */
    public SearchbyAuthor createSearchbyAuthor() {
        return new SearchbyAuthor();
    }

    /**
     * Create an instance of {@link ModifyImage }
     * 
     */
    public ModifyImage createModifyImage() {
        return new ModifyImage();
    }

    /**
     * Create an instance of {@link SearchbyCreaDate }
     * 
     */
    public SearchbyCreaDate createSearchbyCreaDate() {
        return new SearchbyCreaDate();
    }

    /**
     * Create an instance of {@link ListImages }
     * 
     */
    public ListImages createListImages() {
        return new ListImages();
    }

    /**
     * Create an instance of {@link SearchbyAuthorResponse }
     * 
     */
    public SearchbyAuthorResponse createSearchbyAuthorResponse() {
        return new SearchbyAuthorResponse();
    }

    /**
     * Create an instance of {@link SearchbyKeywords }
     * 
     */
    public SearchbyKeywords createSearchbyKeywords() {
        return new SearchbyKeywords();
    }

    /**
     * Create an instance of {@link RegisterImage }
     * 
     */
    public RegisterImage createRegisterImage() {
        return new RegisterImage();
    }

    /**
     * Create an instance of {@link ModifyImageResponse }
     * 
     */
    public ModifyImageResponse createModifyImageResponse() {
        return new ModifyImageResponse();
    }

    /**
     * Create an instance of {@link SearchbyIdResponse }
     * 
     */
    public SearchbyIdResponse createSearchbyIdResponse() {
        return new SearchbyIdResponse();
    }

    /**
     * Create an instance of {@link SearchbyKeywordsResponse }
     * 
     */
    public SearchbyKeywordsResponse createSearchbyKeywordsResponse() {
        return new SearchbyKeywordsResponse();
    }

    /**
     * Create an instance of {@link SearchByTitle }
     * 
     */
    public SearchByTitle createSearchByTitle() {
        return new SearchByTitle();
    }

    /**
     * Create an instance of {@link SearchbyCreaDateResponse }
     * 
     */
    public SearchbyCreaDateResponse createSearchbyCreaDateResponse() {
        return new SearchbyCreaDateResponse();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchbyCreaDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.me.org/", name = "SearchbyCreaDate")
    public JAXBElement<SearchbyCreaDate> createSearchbyCreaDate(SearchbyCreaDate value) {
        return new JAXBElement<SearchbyCreaDate>(_SearchbyCreaDate_QNAME, SearchbyCreaDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListImages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.me.org/", name = "ListImages")
    public JAXBElement<ListImages> createListImages(ListImages value) {
        return new JAXBElement<ListImages>(_ListImages_QNAME, ListImages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.me.org/", name = "SearchByTitleResponse")
    public JAXBElement<SearchByTitleResponse> createSearchByTitleResponse(SearchByTitleResponse value) {
        return new JAXBElement<SearchByTitleResponse>(_SearchByTitleResponse_QNAME, SearchByTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.me.org/", name = "RegisterImageResponse")
    public JAXBElement<RegisterImageResponse> createRegisterImageResponse(RegisterImageResponse value) {
        return new JAXBElement<RegisterImageResponse>(_RegisterImageResponse_QNAME, RegisterImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListImagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.me.org/", name = "ListImagesResponse")
    public JAXBElement<ListImagesResponse> createListImagesResponse(ListImagesResponse value) {
        return new JAXBElement<ListImagesResponse>(_ListImagesResponse_QNAME, ListImagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchbyId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.me.org/", name = "SearchbyId")
    public JAXBElement<SearchbyId> createSearchbyId(SearchbyId value) {
        return new JAXBElement<SearchbyId>(_SearchbyId_QNAME, SearchbyId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchbyAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.me.org/", name = "SearchbyAuthor")
    public JAXBElement<SearchbyAuthor> createSearchbyAuthor(SearchbyAuthor value) {
        return new JAXBElement<SearchbyAuthor>(_SearchbyAuthor_QNAME, SearchbyAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.me.org/", name = "ModifyImage")
    public JAXBElement<ModifyImage> createModifyImage(ModifyImage value) {
        return new JAXBElement<ModifyImage>(_ModifyImage_QNAME, ModifyImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchbyIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.me.org/", name = "SearchbyIdResponse")
    public JAXBElement<SearchbyIdResponse> createSearchbyIdResponse(SearchbyIdResponse value) {
        return new JAXBElement<SearchbyIdResponse>(_SearchbyIdResponse_QNAME, SearchbyIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchbyKeywordsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.me.org/", name = "SearchbyKeywordsResponse")
    public JAXBElement<SearchbyKeywordsResponse> createSearchbyKeywordsResponse(SearchbyKeywordsResponse value) {
        return new JAXBElement<SearchbyKeywordsResponse>(_SearchbyKeywordsResponse_QNAME, SearchbyKeywordsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.me.org/", name = "SearchByTitle")
    public JAXBElement<SearchByTitle> createSearchByTitle(SearchByTitle value) {
        return new JAXBElement<SearchByTitle>(_SearchByTitle_QNAME, SearchByTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchbyCreaDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.me.org/", name = "SearchbyCreaDateResponse")
    public JAXBElement<SearchbyCreaDateResponse> createSearchbyCreaDateResponse(SearchbyCreaDateResponse value) {
        return new JAXBElement<SearchbyCreaDateResponse>(_SearchbyCreaDateResponse_QNAME, SearchbyCreaDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchbyAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.me.org/", name = "SearchbyAuthorResponse")
    public JAXBElement<SearchbyAuthorResponse> createSearchbyAuthorResponse(SearchbyAuthorResponse value) {
        return new JAXBElement<SearchbyAuthorResponse>(_SearchbyAuthorResponse_QNAME, SearchbyAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchbyKeywords }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.me.org/", name = "SearchbyKeywords")
    public JAXBElement<SearchbyKeywords> createSearchbyKeywords(SearchbyKeywords value) {
        return new JAXBElement<SearchbyKeywords>(_SearchbyKeywords_QNAME, SearchbyKeywords.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.me.org/", name = "RegisterImage")
    public JAXBElement<RegisterImage> createRegisterImage(RegisterImage value) {
        return new JAXBElement<RegisterImage>(_RegisterImage_QNAME, RegisterImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://image.me.org/", name = "ModifyImageResponse")
    public JAXBElement<ModifyImageResponse> createModifyImageResponse(ModifyImageResponse value) {
        return new JAXBElement<ModifyImageResponse>(_ModifyImageResponse_QNAME, ModifyImageResponse.class, null, value);
    }

}
