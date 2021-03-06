USE [CentroMedico]
GO
/****** Object:  Table [dbo].[TurnosEnEspera]    Script Date: 22/06/2020 23:11:05 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TurnosEnEspera](
	[especialidad] [varchar](45) NOT NULL,
	[idUsrPac] [int] NOT NULL,
	[idUsrMed] [int] NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
ALTER TABLE [dbo].[TurnosEnEspera]  WITH CHECK ADD  CONSTRAINT [FK_TurnoEnEspIdUsrMed_Medicos] FOREIGN KEY([idUsrMed], [especialidad])
REFERENCES [dbo].[Medicos] ([idUsr], [especialidad])
GO
ALTER TABLE [dbo].[TurnosEnEspera] CHECK CONSTRAINT [FK_TurnoEnEspIdUsrMed_Medicos]
GO
ALTER TABLE [dbo].[TurnosEnEspera]  WITH CHECK ADD  CONSTRAINT [FK_TurnoEnEspIdUsrPac_Pacientes] FOREIGN KEY([idUsrPac])
REFERENCES [dbo].[Pacientes] ([idUsr])
GO
ALTER TABLE [dbo].[TurnosEnEspera] CHECK CONSTRAINT [FK_TurnoEnEspIdUsrPac_Pacientes]
GO
