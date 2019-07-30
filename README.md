# user-registration

How to run

1. First Maven build using cmd.

mvn package

2. Then use docker file to create docker image:

docker build -f DockerFile -t userregistration

3. Then simply run docker container

docker run -p 8080:8080 userregistration

<?xml version="1.0" encoding="UTF-8"?>

-<mxfile compressed="false" type="device" version="11.0.7" etag="LbbjNOKYU8OySRGR0RdG" agent="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36" host="www.draw.io" modified="2019-07-30T19:44:42.658Z">


-<diagram id="44bbcf24-548e-d532-59d3-359de5b44cbb" name="Page-1">


-<mxGraphModel shadow="0" math="0" background="none" pageHeight="826" pageWidth="1169" pageScale="1.5" page="1" fold="1" arrows="1" connect="1" tooltips="1" guides="1" gridSize="10" grid="1" dy="715" dx="3175.5">


-<root>

<mxCell id="0" style=";html=1;"/>

<mxCell id="1" style=";html=1;" parent="0"/>


-<mxCell id="6eae4fabf1afb631-37" style="text;strokeColor=none;fillColor=none;html=1;fontSize=24;fontStyle=1;verticalAlign=middle;align=center;" parent="1" vertex="1" value="Diagram">

<mxGeometry as="geometry" height="40" width="1590" y="40" x="-110"/>

</mxCell>


-<mxCell id="d9WUo4s4VTgTdu4eCLEl-9" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=1;entryY=0.25;entryDx=0;entryDy=0;" parent="1" target="d9WUo4s4VTgTdu4eCLEl-7" source="d9WUo4s4VTgTdu4eCLEl-1" edge="1">

<mxGeometry as="geometry" relative="1"/>

</mxCell>


-<mxCell id="d9WUo4s4VTgTdu4eCLEl-1" style="rounded=0;whiteSpace=wrap;html=1;" parent="1" vertex="1" value="Service registry">

<mxGeometry as="geometry" height="60" width="120" y="100" x="610"/>

</mxCell>


-<mxCell id="d9WUo4s4VTgTdu4eCLEl-4" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=1;entryY=0.5;entryDx=0;entryDy=0;" parent="1" target="d9WUo4s4VTgTdu4eCLEl-1" source="d9WUo4s4VTgTdu4eCLEl-2" edge="1">

<mxGeometry as="geometry" relative="1"/>

</mxCell>


-<mxCell id="d9WUo4s4VTgTdu4eCLEl-2" style="rounded=0;whiteSpace=wrap;html=1;" parent="1" vertex="1" value="UserRegistry">

<mxGeometry as="geometry" height="60" width="120" y="220" x="840"/>

</mxCell>


-<mxCell id="d9WUo4s4VTgTdu4eCLEl-6" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;" parent="1" source="d9WUo4s4VTgTdu4eCLEl-5" edge="1">


-<mxGeometry as="geometry" relative="1">

<mxPoint as="targetPoint" y="240" x="480"/>

</mxGeometry>

</mxCell>


-<mxCell id="d9WUo4s4VTgTdu4eCLEl-5" style="whiteSpace=wrap;html=1;aspect=fixed;" parent="1" vertex="1" value="external">

<mxGeometry as="geometry" height="80" width="80" y="200" x="280"/>

</mxCell>


-<mxCell id="d9WUo4s4VTgTdu4eCLEl-8" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0.5;exitY=0;exitDx=0;exitDy=0;entryX=0.183;entryY=1.033;entryDx=0;entryDy=0;entryPerimeter=0;" parent="1" target="d9WUo4s4VTgTdu4eCLEl-1" source="d9WUo4s4VTgTdu4eCLEl-7" edge="1">

<mxGeometry as="geometry" relative="1"/>

</mxCell>


-<mxCell id="d9WUo4s4VTgTdu4eCLEl-10" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=0;entryY=0.75;entryDx=0;entryDy=0;" parent="1" target="d9WUo4s4VTgTdu4eCLEl-2" source="d9WUo4s4VTgTdu4eCLEl-7" edge="1">

<mxGeometry as="geometry" relative="1"/>

</mxCell>


-<mxCell id="d9WUo4s4VTgTdu4eCLEl-7" style="rounded=0;whiteSpace=wrap;html=1;" parent="1" vertex="1" value="Gateway">

<mxGeometry as="geometry" height="60" width="120" y="210" x="490"/>

</mxCell>

</root>

</mxGraphModel>

</diagram>

</mxfile>
