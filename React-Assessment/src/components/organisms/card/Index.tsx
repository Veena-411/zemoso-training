import React from "react";
import styled from "styled-components";
import LogoImage from "D:/zemoso internship/Assessment/my-app/src/components/assets/Images/Myntra.svg";
import BikeImage from "../../assets/Images/bike.svg";
import BusImage from "../../assets/Images/bus.svg";
import carImage from "../../assets/Images/car.svg";
import trainImage from "../../assets/Images/train.svg";
import MoreImage from "../../assets/Images/more.svg";
import Logo from "../../atoms/Icon/Index";
import Text from "../../atoms/Text/Index";

const MainContent = styled.div`
  display: flex;
  flex-direction: column;
  align-items: flex-start;
  padding: 16px 19px;
  box-sizing: border-box;
  gap: 10px;
  position: absolute;
  width: 571px;
  height: 159px;
  left: 20px;
  top: 20px;
  background-color: #ffffff;
  border-radius: 12px;
`;
const Innerdiv = styled.div`
  display: flex;
  flex-direction: row;
  align-items: flex-start;
  padding: 0px;
  gap: 16px;
  width: 533px;
  height: 127px;
  flex: none;
  order: 0;
  flex-grow: 0;
  background-color: white;
`;
const ContentDiv = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  align-items: flex-start;
  padding: 0px;
  width: 263px;
  height: 70px;
  flex: none;
  order: 0;
  flex-grow: 0;
`;
const IconBox = styled.div`
  display: flex;
  flex-direction: row;
  gap: 16px;
`;
const IconsAndText = styled.div`
  display: flex;
  flex-direction: row;
  gap: 268px;
`;

const VerticalDivisions = styled.div`
  display: flex;
  flex-direction: column;
  gap: 33px;
`;

const HorizontalDivisions = styled.div`
  display: flex;
  flex-direction: row;
  justify-content: space-between;

  gap: 10px;
`;
const MoreBox = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: flex-start;
`;
const card = () => {
  return (
    <MainContent>
      <Innerdiv>
        <Logo imgsrc={LogoImage} />
        <VerticalDivisions>
          <HorizontalDivisions>
            <ContentDiv>
              <Text
                variant="h3"
                fontsize="20px"
                fontwt={500}
                color="#373C38;"
                content="User Experience Designer"
              ></Text>
              <Text
                variant="caption"
                fontsize="12px"
                fontwt={500}
                color="#FF725E"
                content="Myntra"
              ></Text>
              <Text
                variant="caption"
                fontsize="12px"
                fontwt={500}
                color="#656E66"
                content="Hitech city, Hyderabad - 500072"
              ></Text>
            </ContentDiv>
            <MoreBox>
              <Logo imgsrc={MoreImage}></Logo>
            </MoreBox>
          </HorizontalDivisions>
          <IconsAndText>
            <IconBox>
              <Logo imgsrc={BikeImage} />
              <Logo imgsrc={BusImage} />
              <Logo imgsrc={carImage} />
              <Logo imgsrc={trainImage} />
            </IconBox>
            <Text
              variant="caption"
              fontsize="12px"
              fontwt={700}
              color="#656E66"
              content="36 min ago"
            ></Text>
          </IconsAndText>
        </VerticalDivisions>
      </Innerdiv>
    </MainContent>
  );
};

export default card;
