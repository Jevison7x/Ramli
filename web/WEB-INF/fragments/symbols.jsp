<%--
    Document   : symbols
    Created on : May 4, 2018, 12:16:19 AM
    Author     : Jevison7x
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="/WEB-INF/tlds/functions" prefix="jf"%>
<c:catch var="xcp">
<jsp:useBean id="symbol" scope="page" class="com.ramli.RamliSymbol"/>
        <div class="special" id="gallery">
            <div class="container">
                <div class="agileinfo-heading">
                    <h3>The 16 Symbols</h3>
                </div>
                <div class="special-top-grids" id="symbols-grid">
                    <div class="w3-agile-special">
                        <c:set scope="page" var="symbol" value="${symbols[1-1]}"/>
                        <div class="col-md-3 special-grids symbol-div">
                            <div class="special-img">
                                <img class="img-responsive" src="images/symbols/new-symbols/${symbol.imageFileName}" alt="">
                                <div class="captn">
                                    <div class="wthree-special-info">
                                        <h4>${symbol.name}</h4>
                                    </div>
                                    <div class="captn-top">
                                        <p>${jf:summary(symbol.definition)}
                                            <a href="#" data-toggle="modal"
                                               data-target="#symbol-details-modal"
                                               class="read-more"
                                               target-ramli="${symbol.houseNumber}">
                                                Read More
                                            </a>
                                        </p>
                                    </div>
                                    <div class="hidden-image-file-name">
                                        ${symbol.imageFileName}
                                    </div>
                                    <div class="hidden-definition">
                                        ${symbol.definition}
                                    </div>
                                    <div class="hidden-descriptions">
                                        ${symbol.descriptions}
                                    </div>
                                </div>
                            </div>
                        </div>
                        <c:set scope="page" var="symbol" value="${symbols[2-1]}"/>
                        <div class="col-md-3 special-grids symbol-div">
                            <div class="special-img">
                                <img class="img-responsive" src="images/symbols/new-symbols/${symbol.imageFileName}" alt="">
                                <div class="captn">
                                    <div class="wthree-special-info">
                                        <h4>${symbol.name}</h4>
                                    </div>
                                    <div class="captn-top">
                                        <p>${jf:summary(symbol.definition)}
                                            <a href="#" data-toggle="modal"
                                               data-target="#symbol-details-modal"
                                               class="read-more"
                                               target-ramli="${symbol.houseNumber}">
                                                Read More
                                            </a>
                                        </p>
                                    </div>
                                    <div class="hidden-image-file-name">
                                        ${symbol.imageFileName}
                                    </div>
                                    <div class="hidden-definition">
                                        ${symbol.definition}
                                    </div>
                                    <div class="hidden-descriptions">
                                        ${symbol.descriptions}
                                    </div>
                                </div>
                            </div>
                        </div>
                        <c:set scope="page" var="symbol" value="${symbols[3-1]}"/>
                        <div class="col-md-3 special-grids symbol-div">
                            <div class="special-img">
                                <img class="img-responsive" src="images/symbols/new-symbols/${symbol.imageFileName}" alt="">
                                <div class="captn">
                                    <div class="wthree-special-info">
                                        <h4>${symbol.name}</h4>
                                    </div>
                                    <div class="captn-top">
                                        <p>${jf:summary(symbol.definition)}
                                            <a href="#" data-toggle="modal"
                                               data-target="#symbol-details-modal"
                                               class="read-more"
                                               target-ramli="${symbol.houseNumber}">
                                                Read More
                                            </a>
                                        </p>
                                    </div>
                                    <div class="hidden-image-file-name">
                                        ${symbol.imageFileName}
                                    </div>
                                    <div class="hidden-definition">
                                        ${symbol.definition}
                                    </div>
                                    <div class="hidden-descriptions">
                                        ${symbol.descriptions}
                                    </div>
                                </div>
                            </div>
                        </div>
                        <c:set scope="page" var="symbol" value="${symbols[4-1]}"/>
                        <div class="col-md-3 special-grids symbol-div">
                            <div class="special-img">
                                <img class="img-responsive" src="images/symbols/new-symbols/${symbol.imageFileName}" alt="">
                                <div class="captn">
                                    <div class="wthree-special-info">
                                        <h4>${symbol.name}</h4>
                                    </div>
                                    <div class="captn-top">
                                        <p>${jf:summary(symbol.definition)}
                                            <a href="#" data-toggle="modal"
                                               data-target="#symbol-details-modal"
                                               class="read-more"
                                               target-ramli="${symbol.houseNumber}">
                                                Read More
                                            </a>
                                        </p>
                                    </div>
                                    <div class="hidden-image-file-name">
                                        ${symbol.imageFileName}
                                    </div>
                                    <div class="hidden-definition">
                                        ${symbol.definition}
                                    </div>
                                    <div class="hidden-descriptions">
                                        ${symbol.descriptions}
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                    <div class="w3-agile-special">
                        <c:set scope="page" var="symbol" value="${symbols[5-1]}"/>
                        <div class="col-md-3 special-grids symbol-div">
                            <div class="special-img">
                                <img class="img-responsive" src="images/symbols/new-symbols/${symbol.imageFileName}" alt="">
                                <div class="captn">
                                    <div class="wthree-special-info">
                                        <h4>${symbol.name}</h4>
                                    </div>
                                    <div class="captn-top">
                                        <p>${jf:summary(symbol.definition)}
                                            <a href="#" data-toggle="modal"
                                               data-target="#symbol-details-modal"
                                               class="read-more"
                                               target-ramli="${symbol.houseNumber}">
                                                Read More
                                            </a>
                                        </p>
                                    </div>
                                    <div class="hidden-image-file-name">
                                        ${symbol.imageFileName}
                                    </div>
                                    <div class="hidden-definition">
                                        ${symbol.definition}
                                    </div>
                                    <div class="hidden-descriptions">
                                        ${symbol.descriptions}
                                    </div>
                                </div>
                            </div>
                        </div>
                        <c:set scope="page" var="symbol" value="${symbols[6-1]}"/>
                        <div class="col-md-3 special-grids symbol-div">
                            <div class="special-img">
                                <img class="img-responsive" src="images/symbols/new-symbols/${symbol.imageFileName}" alt="">
                                <div class="captn">
                                    <div class="wthree-special-info">
                                        <h4>${symbol.name}</h4>
                                    </div>
                                    <div class="captn-top">
                                        <p>${jf:summary(symbol.definition)}
                                            <a href="#" data-toggle="modal"
                                               data-target="#symbol-details-modal"
                                               class="read-more"
                                               target-ramli="${symbol.houseNumber}">
                                                Read More
                                            </a>
                                        </p>
                                    </div>
                                    <div class="hidden-image-file-name">
                                        ${symbol.imageFileName}
                                    </div>
                                    <div class="hidden-definition">
                                        ${symbol.definition}
                                    </div>
                                    <div class="hidden-descriptions">
                                        ${symbol.descriptions}
                                    </div>
                                </div>
                            </div>
                        </div>
                        <c:set scope="page" var="symbol" value="${symbols[7-1]}"/>
                        <div class="col-md-3 special-grids symbol-div">
                            <div class="special-img">
                                <img class="img-responsive" src="images/symbols/new-symbols/${symbol.imageFileName}" alt="">
                                <div class="captn">
                                    <div class="wthree-special-info">
                                        <h4>${symbol.name}</h4>
                                    </div>
                                    <div class="captn-top">
                                        <p>${jf:summary(symbol.definition)}
                                            <a href="#" data-toggle="modal"
                                               data-target="#symbol-details-modal"
                                               class="read-more"
                                               target-ramli="${symbol.houseNumber}">
                                                Read More
                                            </a>
                                        </p>
                                    </div>
                                    <div class="hidden-image-file-name">
                                        ${symbol.imageFileName}
                                    </div>
                                    <div class="hidden-definition">
                                        ${symbol.definition}
                                    </div>
                                    <div class="hidden-descriptions">
                                        ${symbol.descriptions}
                                    </div>
                                </div>
                            </div>
                        </div>
                        <c:set scope="page" var="symbol" value="${symbols[8-1]}"/>
                        <div class="col-md-3 special-grids symbol-div">
                            <div class="special-img">
                                <img class="img-responsive" src="images/symbols/new-symbols/${symbol.imageFileName}" alt="">
                                <div class="captn">
                                    <div class="wthree-special-info">
                                        <h4>${symbol.name}</h4>
                                    </div>
                                    <div class="captn-top">
                                        <p>${jf:summary(symbol.definition)}
                                            <a href="#" data-toggle="modal"
                                               data-target="#symbol-details-modal"
                                               class="read-more"
                                               target-ramli="${symbol.houseNumber}">
                                                Read More
                                            </a>
                                        </p>
                                    </div>
                                    <div class="hidden-image-file-name">
                                        ${symbol.imageFileName}
                                    </div>
                                    <div class="hidden-definition">
                                        ${symbol.definition}
                                    </div>
                                    <div class="hidden-descriptions">
                                        ${symbol.descriptions}
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                    <div class="w3-agile-special">
                        <c:set scope="page" var="symbol" value="${symbols[9-1]}"/>
                        <div class="col-md-3 special-grids symbol-div">
                            <div class="special-img">
                                <img class="img-responsive" src="images/symbols/new-symbols/${symbol.imageFileName}" alt="">
                                <div class="captn">
                                    <div class="wthree-special-info">
                                        <h4>${symbol.name}</h4>
                                    </div>
                                    <div class="captn-top">
                                        <p>${jf:summary(symbol.definition)}
                                            <a href="#" data-toggle="modal"
                                               data-target="#symbol-details-modal"
                                               class="read-more"
                                               target-ramli="${symbol.houseNumber}">
                                                Read More
                                            </a>
                                        </p>
                                    </div>
                                    <div class="hidden-image-file-name">
                                        ${symbol.imageFileName}
                                    </div>
                                    <div class="hidden-definition">
                                        ${symbol.definition}
                                    </div>
                                    <div class="hidden-descriptions">
                                        ${symbol.descriptions}
                                    </div>
                                </div>
                            </div>
                        </div>
                        <c:set scope="page" var="symbol" value="${symbols[10-1]}"/>
                        <div class="col-md-3 special-grids symbol-div">
                            <div class="special-img">
                                <img class="img-responsive" src="images/symbols/new-symbols/${symbol.imageFileName}" alt="">
                                <div class="captn">
                                    <div class="wthree-special-info">
                                        <h4>${symbol.name}</h4>
                                    </div>
                                    <div class="captn-top">
                                        <p>${jf:summary(symbol.definition)}
                                            <a href="#" data-toggle="modal"
                                               data-target="#symbol-details-modal"
                                               class="read-more"
                                               target-ramli="${symbol.houseNumber}">
                                                Read More
                                            </a>
                                        </p>
                                    </div>
                                    <div class="hidden-image-file-name">
                                        ${symbol.imageFileName}
                                    </div>
                                    <div class="hidden-definition">
                                        ${symbol.definition}
                                    </div>
                                    <div class="hidden-descriptions">
                                        ${symbol.descriptions}
                                    </div>
                                </div>
                            </div>
                        </div>
                        <c:set scope="page" var="symbol" value="${symbols[11-1]}"/>
                        <div class="col-md-3 special-grids symbol-div">
                            <div class="special-img">
                                <img class="img-responsive" src="images/symbols/new-symbols/${symbol.imageFileName}" alt="">
                                <div class="captn">
                                    <div class="wthree-special-info">
                                        <h4>${symbol.name}</h4>
                                    </div>
                                    <div class="captn-top">
                                        <p>${jf:summary(symbol.definition)}
                                            <a href="#" data-toggle="modal"
                                               data-target="#symbol-details-modal"
                                               class="read-more"
                                               target-ramli="${symbol.houseNumber}">
                                                Read More
                                            </a>
                                        </p>
                                    </div>
                                    <div class="hidden-image-file-name">
                                        ${symbol.imageFileName}
                                    </div>
                                    <div class="hidden-definition">
                                        ${symbol.definition}
                                    </div>
                                    <div class="hidden-descriptions">
                                        ${symbol.descriptions}
                                    </div>
                                </div>
                            </div>
                        </div>
                        <c:set scope="page" var="symbol" value="${symbols[12-1]}"/>
                        <div class="col-md-3 special-grids symbol-div">
                            <div class="special-img">
                                <img class="img-responsive" src="images/symbols/new-symbols/${symbol.imageFileName}" alt="">
                                <div class="captn">
                                    <div class="wthree-special-info">
                                        <h4>${symbol.name}</h4>
                                    </div>
                                    <div class="captn-top">
                                        <p>${jf:summary(symbol.definition)}
                                            <a href="#" data-toggle="modal"
                                               data-target="#symbol-details-modal"
                                               class="read-more"
                                               target-ramli="${symbol.houseNumber}">
                                                Read More
                                            </a>
                                        </p>
                                    </div>
                                    <div class="hidden-image-file-name">
                                        ${symbol.imageFileName}
                                    </div>
                                    <div class="hidden-definition">
                                        ${symbol.definition}
                                    </div>
                                    <div class="hidden-descriptions">
                                        ${symbol.descriptions}
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                    <div class="w3-agile-special">
                        <c:set scope="page" var="symbol" value="${symbols[13-1]}"/>
                        <div class="col-md-3 special-grids symbol-div">
                            <div class="special-img">
                                <img class="img-responsive" src="images/symbols/new-symbols/${symbol.imageFileName}" alt="">
                                <div class="captn">
                                    <div class="wthree-special-info">
                                        <h4>${symbol.name}</h4>
                                    </div>
                                    <div class="captn-top">
                                        <p>${jf:summary(symbol.definition)}
                                            <a href="#" data-toggle="modal"
                                               data-target="#symbol-details-modal"
                                               class="read-more"
                                               target-ramli="${symbol.houseNumber}">
                                                Read More
                                            </a>
                                        </p>
                                    </div>
                                    <div class="hidden-image-file-name">
                                        ${symbol.imageFileName}
                                    </div>
                                    <div class="hidden-definition">
                                        ${symbol.definition}
                                    </div>
                                    <div class="hidden-descriptions">
                                        ${symbol.descriptions}
                                    </div>
                                </div>
                            </div>
                        </div>
                        <c:set scope="page" var="symbol" value="${symbols[14-1]}"/>
                        <div class="col-md-3 special-grids symbol-div">
                            <div class="special-img">
                                <img class="img-responsive" src="images/symbols/new-symbols/${symbol.imageFileName}" alt="">
                                <div class="captn">
                                    <div class="wthree-special-info">
                                        <h4>${symbol.name}</h4>
                                    </div>
                                    <div class="captn-top">
                                        <p>${jf:summary(symbol.definition)}
                                            <a href="#" data-toggle="modal"
                                               data-target="#symbol-details-modal"
                                               class="read-more"
                                               target-ramli="${symbol.houseNumber}">
                                                Read More
                                            </a>
                                        </p>
                                    </div>
                                    <div class="hidden-image-file-name">
                                        ${symbol.imageFileName}
                                    </div>
                                    <div class="hidden-definition">
                                        ${symbol.definition}
                                    </div>
                                    <div class="hidden-descriptions">
                                        ${symbol.descriptions}
                                    </div>
                                </div>
                            </div>
                        </div>
                        <c:set scope="page" var="symbol" value="${symbols[15-1]}"/>
                        <div class="col-md-3 special-grids symbol-div">
                            <div class="special-img">
                                <img class="img-responsive" src="images/symbols/new-symbols/${symbol.imageFileName}" alt="">
                                <div class="captn">
                                    <div class="wthree-special-info">
                                        <h4>${symbol.name}</h4>
                                    </div>
                                    <div class="captn-top">
                                        <p>${jf:summary(symbol.definition)}
                                            <a href="#" data-toggle="modal"
                                               data-target="#symbol-details-modal"
                                               class="read-more"
                                               target-ramli="${symbol.houseNumber}">
                                                Read More
                                            </a>
                                        </p>
                                    </div>
                                    <div class="hidden-image-file-name">
                                        ${symbol.imageFileName}
                                    </div>
                                    <div class="hidden-definition">
                                        ${symbol.definition}
                                    </div>
                                    <div class="hidden-descriptions">
                                        ${symbol.descriptions}
                                    </div>
                                </div>
                            </div>
                        </div>
                        <c:set scope="page" var="symbol" value="${symbols[16-1]}"/>
                        <div class="col-md-3 special-grids symbol-div">
                            <div class="special-img">
                                <img class="img-responsive" src="images/symbols/new-symbols/${symbol.imageFileName}" alt="">
                                <div class="captn">
                                    <div class="wthree-special-info">
                                        <h4>${symbol.name}</h4>
                                    </div>
                                    <div class="captn-top">
                                        <p>${jf:summary(symbol.definition)}
                                            <a href="#" data-toggle="modal"
                                               data-target="#symbol-details-modal"
                                               class="read-more"
                                               target-ramli="${symbol.houseNumber}">
                                                Read More
                                            </a>
                                        </p>
                                    </div>
                                    <div class="hidden-image-file-name">
                                        ${symbol.imageFileName}
                                    </div>
                                    <div class="hidden-definition">
                                        ${symbol.definition}
                                    </div>
                                    <div class="hidden-descriptions">
                                        ${symbol.descriptions}
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript">
            $(document).ready(function(){
                $('.read-more').click(function(){
                    var imageFileName = $(this).closest('.captn').find('.hidden-image-file-name').html().trim();
                    var definition = $(this).closest('.captn').find('.hidden-definition').html().trim();
                    var descriptions = $(this).closest('.captn').find('.hidden-descriptions').html().trim();
                    $('#symbol-details-modal .modal-image-file').attr('alt', imageFileName);
                    $('#symbol-details-modal .modal-image-file').attr('src', 'images/symbols/'+imageFileName);
                    $('#symbol-details-modal .modal-title').html(definition);
                    $('#symbol-details-modal .modal-body').html(descriptions);
                });
            });
        </script>
</c:catch>
<c:if test="${xcp ne null}">
    ${xcp.message}
</c:if>