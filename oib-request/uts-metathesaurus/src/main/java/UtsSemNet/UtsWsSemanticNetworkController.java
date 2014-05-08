/**
 * ...
 * <p>
 * -----------------------------------------------------------------------------------<br>
 * (c) 2010-2014 OpenInfobutton Project, Biomedical Informatics, University of Utah<br>
 * Contact: {@code <andrew.iskander@utah.edu>}<br>
 * Biomedical Informatics<br>
 * 421 Wakara Way, Ste 140
 * Salt Lake City, UT 84108-3514<br>
 * Day Phone: 1-801-581-4080<br>
 * -----------------------------------------------------------------------------------
 *
 * @author Andrew Iskander {@code <andrew.iskander@utah.edu>}
 * @version May 5, 2014
 */

package UtsSemNet;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "UtsWsSemanticNetworkController", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UtsWsSemanticNetworkController {


    /**
     * 
     * @param semanticTypeId
     * @param ticket
     * @param version
     * @return
     *     returns UtsSemNet.SemanticTypeDTO
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSemanticType", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetSemanticType")
    @ResponseWrapper(localName = "getSemanticTypeResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetSemanticTypeResponse")
    public SemanticTypeDTO getSemanticType(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param ticket
     * @param version
     * @return
     *     returns UtsSemNet.SemanticNetworkRelationLabelDTO
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSemanticNetworkRelationLabel", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetSemanticNetworkRelationLabel")
    @ResponseWrapper(localName = "getSemanticNetworkRelationLabelResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetSemanticNetworkRelationLabelResponse")
    public SemanticNetworkRelationLabelDTO getSemanticNetworkRelationLabel(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<UtsSemNet.SemanticTypeRelationDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInheritedSemanticTypeRelations", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetInheritedSemanticTypeRelations")
    @ResponseWrapper(localName = "getInheritedSemanticTypeRelationsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetInheritedSemanticTypeRelationsResponse")
    public List<SemanticTypeRelationDTO> getInheritedSemanticTypeRelations(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<UtsSemNet.SemanticNetworkRelationLabelRelationDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInheritedSemanticNetworkRelationLabelRelations", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetInheritedSemanticNetworkRelationLabelRelations")
    @ResponseWrapper(localName = "getInheritedSemanticNetworkRelationLabelRelationsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetInheritedSemanticNetworkRelationLabelRelationsResponse")
    public List<SemanticNetworkRelationLabelRelationDTO> getInheritedSemanticNetworkRelationLabelRelations(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<UtsSemNet.SemanticTypeRelationDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllSemanticTypeRelations", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetAllSemanticTypeRelations")
    @ResponseWrapper(localName = "getAllSemanticTypeRelationsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetAllSemanticTypeRelationsResponse")
    public List<SemanticTypeRelationDTO> getAllSemanticTypeRelations(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<UtsSemNet.SemanticNetworkRelationLabelRelationDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInverseInheritedSemanticNetworkRelationLabelRelations", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetInverseInheritedSemanticNetworkRelationLabelRelations")
    @ResponseWrapper(localName = "getInverseInheritedSemanticNetworkRelationLabelRelationsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetInverseInheritedSemanticNetworkRelationLabelRelationsResponse")
    public List<SemanticNetworkRelationLabelRelationDTO> getInverseInheritedSemanticNetworkRelationLabelRelations(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<UtsSemNet.SemanticTypeRelationDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInverseInheritedSemanticTypeRelations", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetInverseInheritedSemanticTypeRelations")
    @ResponseWrapper(localName = "getInverseInheritedSemanticTypeRelationsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetInverseInheritedSemanticTypeRelationsResponse")
    public List<SemanticTypeRelationDTO> getInverseInheritedSemanticTypeRelations(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<UtsSemNet.SemanticNetworkRelationLabelRelationDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInverseSemanticNetworkRelationLabelRelations", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetInverseSemanticNetworkRelationLabelRelations")
    @ResponseWrapper(localName = "getInverseSemanticNetworkRelationLabelRelationsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetInverseSemanticNetworkRelationLabelRelationsResponse")
    public List<SemanticNetworkRelationLabelRelationDTO> getInverseSemanticNetworkRelationLabelRelations(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<UtsSemNet.SemanticTypeRelationDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInverseSemanticTypeRelations", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetInverseSemanticTypeRelations")
    @ResponseWrapper(localName = "getInverseSemanticTypeRelationsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetInverseSemanticTypeRelationsResponse")
    public List<SemanticTypeRelationDTO> getInverseSemanticTypeRelations(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param semanticRelationLabelId
     * @param relatedSemanticTypeId
     * @param ticket
     * @param version
     * @return
     *     returns UtsSemNet.SemanticNetworkRelationLabelRelationDTO
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSemanticNetworkRelationLabelRelation", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetSemanticNetworkRelationLabelRelation")
    @ResponseWrapper(localName = "getSemanticNetworkRelationLabelRelationResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetSemanticNetworkRelationLabelRelationResponse")
    public SemanticNetworkRelationLabelRelationDTO getSemanticNetworkRelationLabelRelation(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId,
        @WebParam(name = "semanticRelationLabelId", targetNamespace = "")
        String semanticRelationLabelId,
        @WebParam(name = "relatedSemanticTypeId", targetNamespace = "")
        String relatedSemanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<UtsSemNet.SemanticNetworkRelationLabelRelationDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSemanticNetworkRelationLabelRelations", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetSemanticNetworkRelationLabelRelations")
    @ResponseWrapper(localName = "getSemanticNetworkRelationLabelRelationsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetSemanticNetworkRelationLabelRelationsResponse")
    public List<SemanticNetworkRelationLabelRelationDTO> getSemanticNetworkRelationLabelRelations(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param relatedSemanticTypeId
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<UtsSemNet.SemanticNetworkRelationLabelRelationDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSemanticNetworkRelationLabelRelationsForPair", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetSemanticNetworkRelationLabelRelationsForPair")
    @ResponseWrapper(localName = "getSemanticNetworkRelationLabelRelationsForPairResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetSemanticNetworkRelationLabelRelationsForPairResponse")
    public List<SemanticNetworkRelationLabelRelationDTO> getSemanticNetworkRelationLabelRelationsForPair(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId,
        @WebParam(name = "relatedSemanticTypeId", targetNamespace = "")
        String relatedSemanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticGroup
     * @param ticket
     * @param version
     * @return
     *     returns UtsSemNet.SemanticTypeGroupDTO
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSemanticTypeGroup", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetSemanticTypeGroup")
    @ResponseWrapper(localName = "getSemanticTypeGroupResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetSemanticTypeGroupResponse")
    public SemanticTypeGroupDTO getSemanticTypeGroup(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticGroup", targetNamespace = "")
        String semanticGroup)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param relatedSemanticTypeId
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<UtsSemNet.SemanticTypeRelationDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSemanticTypeRelationsForPair", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetSemanticTypeRelationsForPair")
    @ResponseWrapper(localName = "getSemanticTypeRelationsForPairResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetSemanticTypeRelationsForPairResponse")
    public List<SemanticTypeRelationDTO> getSemanticTypeRelationsForPair(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId,
        @WebParam(name = "relatedSemanticTypeId", targetNamespace = "")
        String relatedSemanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param semanticRelationLabelId
     * @param relatedSemanticTypeId
     * @param ticket
     * @param version
     * @return
     *     returns UtsSemNet.SemanticTypeRelationDTO
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSemanticTypeRelation", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetSemanticTypeRelation")
    @ResponseWrapper(localName = "getSemanticTypeRelationResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetSemanticTypeRelationResponse")
    public SemanticTypeRelationDTO getSemanticTypeRelation(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId,
        @WebParam(name = "semanticRelationLabelId", targetNamespace = "")
        String semanticRelationLabelId,
        @WebParam(name = "relatedSemanticTypeId", targetNamespace = "")
        String relatedSemanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticTypeId
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<UtsSemNet.SemanticTypeRelationDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSemanticTypeRelations", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetSemanticTypeRelations")
    @ResponseWrapper(localName = "getSemanticTypeRelationsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetSemanticTypeRelationsResponse")
    public List<SemanticTypeRelationDTO> getSemanticTypeRelations(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticTypeId", targetNamespace = "")
        String semanticTypeId)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param semanticGroup
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<UtsSemNet.SemanticTypeDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSemanticTypesByGroup", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetSemanticTypesByGroup")
    @ResponseWrapper(localName = "getSemanticTypesByGroupResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetSemanticTypesByGroupResponse")
    public List<SemanticTypeDTO> getSemanticTypesByGroup(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "semanticGroup", targetNamespace = "")
        String semanticGroup)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<UtsSemNet.SemanticNetworkRelationLabelRelationDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllSemanticNetworkRelationLabelRelations", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetAllSemanticNetworkRelationLabelRelations")
    @ResponseWrapper(localName = "getAllSemanticNetworkRelationLabelRelationsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetAllSemanticNetworkRelationLabelRelationsResponse")
    public List<SemanticNetworkRelationLabelRelationDTO> getAllSemanticNetworkRelationLabelRelations(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<UtsSemNet.SemanticNetworkRelationLabelDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllSemanticNetworkRelationLabels", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetAllSemanticNetworkRelationLabels")
    @ResponseWrapper(localName = "getAllSemanticNetworkRelationLabelsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetAllSemanticNetworkRelationLabelsResponse")
    public List<SemanticNetworkRelationLabelDTO> getAllSemanticNetworkRelationLabels(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<UtsSemNet.SemanticTypeGroupDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllSemanticTypeGroups", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetAllSemanticTypeGroups")
    @ResponseWrapper(localName = "getAllSemanticTypeGroupsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetAllSemanticTypeGroupsResponse")
    public List<SemanticTypeGroupDTO> getAllSemanticTypeGroups(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param ticket
     * @param version
     * @return
     *     returns java.util.List<UtsSemNet.SemanticTypeDTO>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllSemanticTypes", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetAllSemanticTypes")
    @ResponseWrapper(localName = "getAllSemanticTypesResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "UtsSemNet.GetAllSemanticTypesResponse")
    public List<SemanticTypeDTO> getAllSemanticTypes(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version)
        throws UtsFault_Exception
    ;

}