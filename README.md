# user-registration

How to run

1. First Maven build using cmd.

mvn package

2. Then use docker file to create docker image:

docker build -f DockerFile -t userregistration

3. Then simply run docker container

docker run -p 8080:8080 userregistration

<?xml version="1.0" encoding="UTF-8"?>
<mxfile modified="2019-07-30T19:44:42.658Z" host="www.draw.io" agent="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36" etag="LbbjNOKYU8OySRGR0RdG" version="11.0.7" type="device" compressed="false">
  <diagram name="Page-1" id="44bbcf24-548e-d532-59d3-359de5b44cbb">
    <mxGraphModel dx="3175.5" dy="715" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="1" pageScale="1.5" pageWidth="1169" pageHeight="826" background="none" math="0" shadow="0">
      <root>
        <mxCell id="0" style=";html=1;"/>
        <mxCell id="1" style=";html=1;" parent="0"/>
        <mxCell id="6eae4fabf1afb631-37" value="Diagram" style="text;strokeColor=none;fillColor=none;html=1;fontSize=24;fontStyle=1;verticalAlign=middle;align=center;" parent="1" vertex="1">
          <mxGeometry x="-110" y="40" width="1590" height="40" as="geometry"/>
        </mxCell>
        <mxCell id="d9WUo4s4VTgTdu4eCLEl-9" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=1;entryY=0.25;entryDx=0;entryDy=0;" edge="1" parent="1" source="d9WUo4s4VTgTdu4eCLEl-1" target="d9WUo4s4VTgTdu4eCLEl-7">
          <mxGeometry relative="1" as="geometry"/>
        </mxCell>
        <mxCell id="d9WUo4s4VTgTdu4eCLEl-1" value="Service registry" style="rounded=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="610" y="100" width="120" height="60" as="geometry"/>
        </mxCell>
        <mxCell id="d9WUo4s4VTgTdu4eCLEl-4" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=1;entryY=0.5;entryDx=0;entryDy=0;" edge="1" parent="1" source="d9WUo4s4VTgTdu4eCLEl-2" target="d9WUo4s4VTgTdu4eCLEl-1">
          <mxGeometry relative="1" as="geometry"/>
        </mxCell>
        <mxCell id="d9WUo4s4VTgTdu4eCLEl-2" value="UserRegistry" style="rounded=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="840" y="220" width="120" height="60" as="geometry"/>
        </mxCell>
        <mxCell id="d9WUo4s4VTgTdu4eCLEl-6" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;" edge="1" parent="1" source="d9WUo4s4VTgTdu4eCLEl-5">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="480" y="240" as="targetPoint"/>
          </mxGeometry>
        </mxCell>
        <mxCell id="d9WUo4s4VTgTdu4eCLEl-5" value="external" style="whiteSpace=wrap;html=1;aspect=fixed;" vertex="1" parent="1">
          <mxGeometry x="280" y="200" width="80" height="80" as="geometry"/>
        </mxCell>
        <mxCell id="d9WUo4s4VTgTdu4eCLEl-8" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0.5;exitY=0;exitDx=0;exitDy=0;entryX=0.183;entryY=1.033;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="1" source="d9WUo4s4VTgTdu4eCLEl-7" target="d9WUo4s4VTgTdu4eCLEl-1">
          <mxGeometry relative="1" as="geometry"/>
        </mxCell>
        <mxCell id="d9WUo4s4VTgTdu4eCLEl-10" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=0;entryY=0.75;entryDx=0;entryDy=0;" edge="1" parent="1" source="d9WUo4s4VTgTdu4eCLEl-7" target="d9WUo4s4VTgTdu4eCLEl-2">
          <mxGeometry relative="1" as="geometry"/>
        </mxCell>
        <mxCell id="d9WUo4s4VTgTdu4eCLEl-7" value="Gateway" style="rounded=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="490" y="210" width="120" height="60" as="geometry"/>
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
</mxfile>
