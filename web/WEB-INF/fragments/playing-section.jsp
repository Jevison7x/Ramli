<%--
    Document   : playing-section
    Created on : May 9, 2018, 12:57:26 PM
    Author     : Jevison7x
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <div id="play-section" style="padding: 20px 0;">
            <div class="container">
                <div class="agileinfo-heading">
                    <h4>Choose a topic</h4>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <div id="clock-div" class="container-box">JQuery Date/Time should show here</div>
                        <select id="topic-selector">
                            <option name="topicValue" value="">Select a topic</option>
                            <optgroup label="LIFE, MIND AND SITUATION">
                                <option value="Nation">Nation</option>
                                <option value="Health">Health</option>
                                <option value="Mind">Mind</option>
                                <option value="Life">Life</option>
                            </optgroup>
                            <optgroup label="WEALTH, MONEY AND INVESTMENT">
                                <option value="Wealth">Wealth</option>
                                <option value="Brothers and Sisters">Brothers and Sisters</option>
                                <option value="Parent">Parent</option>
                            </optgroup>
                        </select>
                        <div id="note-box" class="container-box" style="padding-right: 5px; text-align: justify;">
                            Note that this time is very important as some formulas and judgments are
                            influenced at the time minds inquire a question so date and time is very crucial in ramli.
                        </div>
                        <div>
                            <button id="continue-topic" class="template-btn">Continue</button>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <img alt="Geomantic Tools" src="images/Geomantic-Tools-600.png" style="width: 100%; margin-top: 20px;"/>
                    </div>
                </div>
            </div>
        </div>
